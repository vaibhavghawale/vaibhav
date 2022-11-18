package com.masai.Model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("emp.properties")
public class appConfig {
    @Bean
    public List<Employee> getList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(50,"manish",1000));
        list.add(new Employee(51,"lokesh",6000));
        list.add(new Employee(52,"raj",3000));
        list.add(new Employee(53,"suresh",9000));
        list.add(new Employee(54,"mahesh",8500));
        return list;
    }

    @Bean(name = "theMap")
    public Map<Department, Employee> getMap(){
        Map<Department, Employee> map = new HashMap<>();
        map.put(new Department(101 , "sales", "bangalore"),new Employee(1,"vinay",20000));
        map.put(new Department(102,"hr", "Hyd"),new Employee(2,"vijay",4000));
        map.put(new Department(103,"marketing", "Delhi"),new Employee(3,"vamshi",60000));
        return map;
    }
}