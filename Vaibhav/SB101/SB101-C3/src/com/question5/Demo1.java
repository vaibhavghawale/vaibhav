package com.question5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {

	Address address=new Address("maharashtra","nagpur","441120");

	public static void main(String[] args) throws IOException {
		
		Student st1=new Student(101,"Vaibhav",500,"vaib@gmail.com","1@bd",new Address("maharashtra","nagpur","441120"));
		Student st2=new Student(101,"Soham",440,"soh@gmail.com","jh@66",new Address("Andrapradesh","vishakhapattanam","96720"));
		Student st3=new Student(101,"Rushi",390,"rush@gmail.com","5ky&ts",new Address("karnataka","benglore","501120"));
		Student st4=new Student(101,"Aman",399,"amsn@gmail.com","Gsd@fs",new Address("uttar Pradesh","Gaya","241120"));
		Student st5=new Student(101,"bhavesh",549,"bhav@gmail.com","Jh@$ds",new Address("Gujrat","surat","986120"));
		
		
		
		FileOutputStream file= new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream out= new ObjectOutputStream(file);
		
		out.writeObject(st1);
		out.writeObject(st2);
		out.writeObject(st3);
		out.writeObject(st4);
		out.writeObject(st5);
		
		out.flush();
		out.close();
		
		System.out.println("Done");
		
		
		
	}
	
}
