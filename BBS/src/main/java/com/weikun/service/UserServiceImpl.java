package com.weikun.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import com.weikun.dao.IUserDAO;
import com.weikun.dao.UserDAOImpl;
import com.weikun.vo.BBSUser;

public class UserServiceImpl implements IUserService {
	private IUserDAO dao=new UserDAOImpl();
	//存储所上传文件支持的类型
	private Map<String,String> types=new HashMap<String,String>();
	
	/** 初始化上传文件的临时存放目录 */  
	private File tmpDir = null;  
	/** 初始化上传文件后的保存目录 */  
	private File saveDir = null;  
	public static void main(String[] args) {
		System.out.println(File.separator);
	}
	public UserServiceImpl(){
		types.put("image/jpeg", ".jpg");
		types.put("image/gif", ".gif");
		types.put("image/x-ms-bmp", ".bmp");
		types.put("image/png", ".png");
		
		
		String temp=File.separator+"tmpdir";// \\
		String save=File.separator+"upload";
		
		
		tmpDir=new File(temp);
		saveDir=new File(save);
	}
	@Override
	public BBSUser login(BBSUser user) {
		// TODO Auto-generated method stub
		return dao.login(user);
	}
	@Override
	public InputStream getPic(int id) {
		// TODO Auto-generated method stub
		return dao.getPic(id);
	}
	@Override
	public boolean register(BBSUser user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}
	@Override
	public BBSUser uploadPic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		String tpath=request.getServletContext().getRealPath("/");//tomcat path
		BBSUser user=null;
		if(ServletFileUpload.isMultipartContent(request)){//先判断是否是二进制流上传头像的提交方式
			DiskFileItemFactory factory=new DiskFileItemFactory();
			factory.setRepository(tmpDir);//设置上传临时目录
			factory.setSizeThreshold(1024*1024);//设置缓存大小
			
			ServletFileUpload upload=new ServletFileUpload();
			
			upload.setFileSizeMax(1024*1024*10);//单个文件的大小
			upload.setSizeMax(1024*1024*10*2);//总文件的大小不超过20M
			
			
			try {
				FileItemIterator it=upload.getItemIterator(request);
				user=new BBSUser();
				
				
				while(it.hasNext()){
					FileItemStream fs=it.next();
					//找到他上传的文件类型
					
					String contentType=fs.getContentType();
					//上传组件的name值
					String fieldName=fs.getFieldName();
					//文件域或文本域的值以流的形式找到
					InputStream fis=fs.openStream();
//					/fs.isFormField():true:是文本域 false是文件域
					if(!fs.isFormField()&&fs.getName().length()>0){
						if(!types.containsKey(contentType)){							
							request.setAttribute("error", "错误的上传头像类型！");	
							
							break;
						}
						//彻底上传得了额
						//使用缓冲流
						
						BufferedInputStream bis=new BufferedInputStream(fis);
						
						//1.jpg
						String fo=tpath+"\\"+this.saveDir.getName()+"\\"+request.getSession().getId()+types.get(contentType);//将要存储的文件名
						BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(fo)));
						
						user.setFpath(fo);
						Streams.copy(bis, bos, true);						
						
						
					}else{//文本域内容
						switch (fieldName) {
						case "reusername":
							user.setUsername(Streams.asString(fis,"utf-8"));
							break;
						case "repassword":
							user.setPassword(Streams.asString(fis,"utf-8"));
							break;	
						default:
							break;
						}
						
						
					}
				}
			}  catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
					
		}
		
		
		
		return user;
	}

}
