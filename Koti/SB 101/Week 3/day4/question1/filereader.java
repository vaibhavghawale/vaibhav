package com.day4.question1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filereader {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("E://abc.txt",true);
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a Employee name");
		
		String Name=scanner.nextLine();
		
		System.out.println("Enter a employee address");
		
		String Address=scanner.nextLine();
		
		scanner.close();
		
		fileWriter.write(Name);
		fileWriter.write("\n");
		fileWriter.write(Address);
		
		fileWriter.flush();
		fileWriter.close();
		
		System.out.println("Done");
		
		
	}
}
