package com.question5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class Demo2 {


	public static void main(String[] args) throws Exception{
	
		
		
		FileInputStream file= new FileInputStream("studentdata.txt");
	
		ObjectInputStream objectOutputStream=new ObjectInputStream(file);
		
		List<Student> list =(List<Student>) objectOutputStream.readObject();
		
		list.add(new Student(106,"akash",549,"ak@gmail.com","ah@ds",new Address("Telangana","hydrabad","36720")));
		
		ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
		objout.writeObject(list);
		list.forEach(s -> System.out.println(s));
		
		
		System.out.println("Deserilization Done ");
		
	}



}
