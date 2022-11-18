package com.Sprint1.day1.question3;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<Library> hs= new HashSet<>();
		
		hs.add(new Library(101,"Wish I could Tell you","Durjoy Datta"));
		hs.add(new Library(202,"You Never Know","Akash Verma"));
		hs.add(new Library(303,"Atom","Ravi M. Shah"));
		hs.add(new Library(404,"A Reason to Live","R. Mahingam"));
		hs.add(new Library(303,"Dare You & Me","Sara Johson"));
		
		
		HashSet<Member> m= new HashSet<>();
		
		m.add(new Member(1,"Vaibhav",100,"10/10/2023"));
		m.add(new Member(1,"Vaibhav",100,"10/10/2023"));
		
		
		System.out.println(m);
		
	}
	
	
}
