package com.weikun.dom4j;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class A {
	public static void main(String[] args) {
		new A().readXML();
	}
	public void readXML(){
		//1找到哪个文件
		FileInputStream fis=null;
		File file=new File(A.class.getClassLoader().getResource("").getPath()+"//yst.xml");
		
		try {
			fis=new FileInputStream(file);
			BufferedReader reader=new BufferedReader(new InputStreamReader(fis,"utf-8"));
			
			String line=null;
			StringBuffer sb=new StringBuffer();
			while( (line=reader.readLine())!=null){
				sb.append(line.trim());
			}
			Element root=null;
			root=DocumentHelper.parseText(sb.toString()).getRootElement();
			
			List <Element> slist=root.elements("student");
			
			for(Element stu :slist){
				Element name=stu.element("name");
				
				Element address=stu.element("address");
				System.out.println(stu.attributeValue("id"));
				System.out.println(name.attributeValue("value"));
				System.out.println(address.attributeValue("value")); 				
			}			
			fis=new FileInputStream(file);			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
	}
	public void writeXML(){
		FileOutputStream fos=null;
		try {
			String path=A.class.getClassLoader().getResource("").getPath();
			
			File file=new File(path+"//yst.xml");
			
			fos=new FileOutputStream(file);
			
			OutputFormat of=OutputFormat.createPrettyPrint();
			of.setEncoding("utf-8");
			of.setIndentSize(4);
			
			
			XMLWriter writer=new XMLWriter(fos,of);
			Document doc=DocumentHelper.createDocument();
			
			Element root=doc.addElement("yst");//根
			
			
			
			Element stu1=root.addElement("student");
			stu1.addAttribute("id", "001");
			Element name1=stu1.addElement("name");
			
			name1.addAttribute("value", "郭伯伯");
			
			
			Element address1=stu1.addElement("address");
			
			address1.addAttribute("value", "北京市");
			
			Element stu2=root.addElement("student");
			stu2.addAttribute("id", "002");
			Element name2=stu2.addElement("name");
			
			name2.addAttribute("value", "徐伯伯");
			

			Element address2=stu2.addElement("address");
			
			address2.addAttribute("value", "哈尔滨市");
			
			
			writer.write(doc);
			System.out.println(doc.asXML());
			writer.flush();
			writer.close();
			fos.flush();
			fos.close();
			System.out.println("ok");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
		
	}
}
