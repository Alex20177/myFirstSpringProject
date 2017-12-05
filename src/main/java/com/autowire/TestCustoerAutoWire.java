package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustoerAutoWire {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beanAutoWire.xml");
		Customer_Autowired ca = (Customer_Autowired) context.getBean("customer_Autowired");
		System.out.println(ca.getCust_address().getBuild_no()+"\t"+ca.getCust_address().getCity_name()+"\t"+ca.getCust_address().getPin_code()+"\t"+ca.getCust_id()+"\t"+ca.getCust_name());
		
	}

}
