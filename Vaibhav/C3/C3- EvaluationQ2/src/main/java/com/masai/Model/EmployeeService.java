package com.masai.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    private Map<Department, Employee> theMap; // inject 3 entries

    @Autowired
    @Qualifier("getList")
    private List<Employee> theList; //inject List of 5 Employee object

    @Value("${appname1}")
    private String appName; //inject the AppName from the properties file

    public void printMap(){
        //print all the employee's and their department's details from theMap
        System.out.println(theMap);
    }
    public void printList(){
        theList.sort((a,b)-> a.getSalary()>b.getSalary() ?1:-1);
        for(Employee em: theList) System.out.println(em);

    }
    public void printAppName(){
        //print the injected appName
        System.out.println(appName);
    }



}
