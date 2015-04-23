package com.weikun.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("beans.xml");
		
		BeanFactory bean=new XmlBeanFactory(res);
		Car car=(Car)bean.getBean("car");
		System.out.println(car.getColor());
	}

}
