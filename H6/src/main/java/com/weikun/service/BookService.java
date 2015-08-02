package com.weikun.service;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

import com.weikun.vo.Book;

public class BookService {
	public String getBook(Book book){//把对象转换为XML
		String result="";
		try {
			
			Element root=new Element("yst");
			
			Element b=new Element("book");
			b.setAttribute("id", String.valueOf(book.getId()));
			
			
			Element name=new Element("name");
			
			name.addContent(book.getName());
			

			Element path=new Element("path");
			
			path.addContent(book.getPath());
			
			
			Element price=new Element("price");
			
			price.addContent(String.valueOf(book.getPrice()));
			
			b.addContent(name);
			b.addContent(path);
			b.addContent(price);
			
			
			root.addContent(b);
			
			
			Document doc=new Document(root);
			
		
			XMLOutputter out=new  XMLOutputter();
			
			result=out.outputString(doc);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}
}
