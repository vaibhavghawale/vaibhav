package com.masai.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



    public class Demo {

        public static void main(String[] args) {
            ApplicationContext apc = new AnnotationConfigApplicationContext(appConfig.class);
            EmployeeService es = apc.getBean("employeeService",EmployeeService.class);
            es.printMap();
            es.printList();
            es.printAppName();


        }
    }

