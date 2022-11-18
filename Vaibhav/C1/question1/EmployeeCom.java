package com.Evaluation.C1.question1;

public class EmployeeCom implements Comparable<Empolyee>{


	  String name;
	 
	    public void Employee(String name)
	    {
	        this.name = name;
	    }
	
	    @Override
	    public int compareTo(Empolyee e) {
	        return this.name.compareTo(e.getName());
	    }
	}
