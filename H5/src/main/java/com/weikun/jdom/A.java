package com.weikun.jdom;

import java.io.File;
import java.io.FileOutputStream;



import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;



public class A {
	public static void main(String[] args) {
		new A().readXML();
	}
	public void readXML(){
		SAXBuilder sb=new SAXBuilder();
		File file=new File(A.class.getClassLoader().getResource("").getPath()+"//yst1.xml");
		try {
			Document doc=sb.build(file);
			
			Element root=doc.getRootElement();
			
			List<Element> list=root.getChildren("student");
			
			for(Element stu:list){
				
				System.out.println(stu.getAttributeValue("id"));
				
				Element name=stu.getChild("name");
				System.out.println(name.getAttributeValue("value"));
				Element address=stu.getChild("address");
				System.out.println(address.getAttributeValue("value"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public void writerXML(){
		try {
			File file=new File(A.class.getClassLoader().getResource("").getPath()+"//yst1.xml");
			Element root= new Element("yst");
			
			
			
			Element stu1=new Element("student");
			
			stu1.setAttribute("id", "001");
			
			Element name1=new Element("name");
			
			name1.setAttribute("value", "郭伯伯");
			
			Element addr1=new Element("address");
			
			addr1.setAttribute("value", "北京市");
			
			stu1.addContent(name1);
			stu1.addContent(addr1);
			
			
			

			Element stu2=new Element("student");
			
			stu2.setAttribute("id", "002");
			
			Element name2=new Element("name");
			
			name2.setAttribute("value", "徐伯伯");
			
			Element addr2=new Element("address");
			
			addr2.setAttribute("value", "哈尔滨市");
			
			stu2.addContent(name2);
			stu2.addContent(addr2);
			
			
			root.addContent(stu1);
			root.addContent(stu2);
			
			
			
			Document doc=new Document(root);
			
			XMLOutputter writer=new XMLOutputter();
			
			writer.output(doc, new FileOutputStream(file));
			
			System.out.println(writer.outputString(doc));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
