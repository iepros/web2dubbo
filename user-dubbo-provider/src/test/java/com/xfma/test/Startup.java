package com.xfma.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.RequestContextListener;

public class Startup {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String [] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("服务发布完成。。。");
		System.in.read();
	}
}
