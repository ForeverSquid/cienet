package com.weikun.sax;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;



public class A extends DefaultHandler{
	public static void main(String[] args) {
		new A().write();
	}
	public void write(){
		SAXTransformerFactory stf=(SAXTransformerFactory)SAXTransformerFactory.newInstance();
		
		try {
			TransformerHandler th=stf.newTransformerHandler();
			
			Transformer tf=th.getTransformer();
			
			tf.setOutputProperty(OutputKeys.ENCODING, "utf-8");
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			File file=new File(A.class.getClassLoader().getResource("").getPath()+"//yst2.xml");
			FileOutputStream fos=new FileOutputStream(file);
			Writer sw=new StringWriter();
			
			
//			StreamResult res=new StreamResult(fos);
//			th.setResult(res);
			StreamResult res1=new StreamResult(sw);
			th.setResult(res1);
			
			
			
			th.startDocument();
			th.startElement("", "", "yst", null);
			AttributesImpl attr=new AttributesImpl();
		
			attr.addAttribute( "", "", "id", "", "001");
			
			th.startElement("", "", "student", attr);
			
			
			
			th.startElement("", "", "name", null);
			th.characters("郭伯伯".toCharArray(), 0, "郭伯伯".length());
			th.endElement("", "", "name");
			
			attr.clear();
			attr.addAttribute( "", "", "value", "", "北京市");
			th.startElement("", "", "address", attr);
			th.endElement("", "", "address");
			th.endElement("", "", "student");
			
			
			AttributesImpl attr1=new AttributesImpl();
			
			attr1.addAttribute( "", "", "id", "", "002");
			
			th.startElement("", "", "student", attr1);
			
			
			
			th.startElement("", "", "name", null);
			th.characters("徐伯伯".toCharArray(), 0, "徐伯伯".length());
			th.endElement("", "", "name");
			
			attr1.clear();
			attr1.addAttribute( "", "", "value", "", "哈尔滨市");
			th.startElement("", "", "address", attr1);
			th.endElement("", "", "address");
			th.endElement("", "", "student");
			
			
			
			th.endElement("", "", "yst");
			
			
			
			
			th.endDocument();
			
			
			
			fos.flush();
			fos.close();
			String result=sw.toString();
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void read(){
		SAXParserFactory spf=null;
		FileInputStream fis=null;
		try {
			File file=new File(A.class.getClassLoader().getResource("").getPath()+"//yst.xml");
			fis=new FileInputStream(file);
			spf=SAXParserFactory.newInstance();
			
			SAXParser sp=spf.newSAXParser();
			
			
			
			sp.parse(fis, new A());
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("start:document");
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end:document");
	}
	@Override
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(arg0, arg1, arg2, arg3);
		
		System.out.println("start:"+arg2);
		if(arg3.getValue("id")!=null){
			System.out.println(arg3.getValue("id"));
		}
		if(arg3.getValue("value")!=null){
			System.out.println(arg3.getValue("value"));
		}
	}
	@Override
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(arg0, arg1, arg2);
		System.out.println("end:"+arg2);
	}
	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(arg0, arg1, arg2);
		String value=new String(arg0,arg1,arg2);
		System.out.println(value.trim());
	}
}
