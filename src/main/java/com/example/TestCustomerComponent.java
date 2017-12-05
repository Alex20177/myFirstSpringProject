package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerComponent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer_Component cc = (Customer_Component) context.getBean("customer_Component");
		System.out.println(cc.getCust_address().getCity_name()+"\t"+cc.getCust_address().getBuild_no()+"\t"+cc.getCust_id()+"\t"+cc.getCust_name());
		
	}//Close main

}//Close TestCustomerComponent
