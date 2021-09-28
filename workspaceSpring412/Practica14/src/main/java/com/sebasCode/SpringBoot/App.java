package com.sebasCode.SpringBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sebasCode.beans.Mundo;

public class App{
	 public static void main( String[] args ) {
	 ApplicationContext appContext = new
	 ClassPathXmlApplicationContext("com/sebasCode/xml/beans.xml");
	 Mundo m = (Mundo)appContext.getBean("mundo");
	 System.out.println(m.getSaludo());
	 }
	}

