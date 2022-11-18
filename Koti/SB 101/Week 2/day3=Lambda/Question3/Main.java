package day3.Question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Map<String, Student> hm=new HashMap<>();
		
		hm.put("India",new Student(79,"Koti","Koti@143.com",799));
		hm.put("Russia",new Student(49,"Divya","Divya@143.com",798));
		hm.put("USA",new Student(27,"Kiran","Kiran@143.com",900));
		hm.put("Lanka",new Student(55,"Vamsi","Swathi@183.com",600));
		hm.put("Japan",new Student(69,"Dhoni","Mikel@123.com",1000));
		
		// sorting marks in student object
//		Set<Map.Entry<String, Student>> set=hm.entrySet();	
//		Set<Map.Entry<String, Student>> Sorted_set=new TreeSet<>(
//				(s1,s2)->s1.getValue().getMarks()>s2.getValue().getMarks() ? 1:-1);
//		Sorted_set.addAll(set);
//		Sorted_set.forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		
		//// sorting name in student object
		Set<Map.Entry<String, Student>> set=hm.entrySet();	
		Set<Map.Entry<String, Student>> Sorted_set=new TreeSet<>(
				(s1,s2)->s2.getValue().getName().compareTo(s1.getValue().getName()));
		Sorted_set.addAll(set);
		Sorted_set.forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		
		
		
}
}
