package com.example.SpringAOPApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("customer.xml");

        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceProxy");

        System.out.println("********************************************");
        customerService.printName();
        System.out.println("********************************************");
        customerService.printUrl();
        System.out.println("********************************************");
        try {
            customerService.printThrowException();
        }
        catch (Exception e)
        {

        }
    }
}
