package com.day4.question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class bufferreader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bReader =new BufferedReader(new FileReader("E://abc.txt"));
		
		String lineString =bReader.readLine();
		
		while (lineString !=null) {
			System.out.println(lineString);
			lineString =bReader.readLine();
			
		}
		bReader.close();
		System.out.println("Done");
		
	}
}
