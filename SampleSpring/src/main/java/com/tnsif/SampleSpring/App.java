package com.tnsif.SampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext var = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Customer c1 = var.getBean("customer1",Customer.class);
    	c1.order();
    	
    }
}
