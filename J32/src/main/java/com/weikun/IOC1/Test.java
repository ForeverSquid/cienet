package com.weikun.IOC1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource res=new ClassPathResource("beans.xml");
//		
//		BeanFactory bean=new XmlBeanFactory(res);
//		
//		
//		JavaTrad trad=(JavaTrad)bean.getBean("trad");
//		trad.javaCourse();
		
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//JavaTrad trad=(JavaTrad)ctx.getBean("trad");
		//trad.javaCourse();
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:beans.xml");
		JavaTrad trad=(JavaTrad)ctx.getBean("trad1");
		trad.javaCourse();
		
	}

}
