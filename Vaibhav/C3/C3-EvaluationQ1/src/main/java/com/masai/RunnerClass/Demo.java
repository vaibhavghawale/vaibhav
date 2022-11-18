package com.masai.RunnerClass;

import com.masai.Model.Employee;
import com.masai.PresentationLayer.PresentationBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        PresentationBean presentationBean= ctx.getBean("b5", PresentationBean.class);
//        presentationBean.insertEmployee();
//        presentationBean.printAllEmployee();
//        presentationBean.searchEmployee();
        presentationBean.deleteEmployee();




    }
}
