package com.Sprint2.day1.question1;

import java.util.Scanner;

public class Main {

	
	public int sqaure(String num) throws NumberFormatException {
		
		int ans=0;
		
		if(ans==0) {
			int number = Integer.parseInt(num);
			ans=number*number;
			return ans;
		}else {
			String msg="Entered input is not a valid for mat for an integer";
			NumberFormatException ne=new NumberFormatException(msg);
			throw ne;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("PLease Enter any number");
		String num=input.nextLine();
		Main m=new Main();
		
		try{
			int ans = m.sqaure(num);
			
			System.out.println(ans);
            
        }
        catch (Exception ne){
           System.out.println(ne.getMessage());
        }
		
		System.out.println("The work has been done successfully");
		
		input.close();
		
	}
	
	
}
