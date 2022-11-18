package day2.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
public static void main(String[] args) {
	List<String> L1=new ArrayList<>();
	L1.add("Nandigama");
	L1.add("Hyderabad");
	L1.add("Vizak");
	L1.add("Nuzvidu");
	
// Sort List of integers using Collections.sort() method
//	Collections.sort(L1);    //For Ascending order
	Collections.reverse(L1); //For descending order
	System.out.println(L1);
	

}
}
