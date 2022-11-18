package day2.Question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Product> L1=new ArrayList<>();
		L1.add(new Product(79,"Slippers",2,500));
		L1.add(new Product(99,"Shoes",4,900));
		L1.add(new Product(80,"Belts",7,600));
		L1.add(new Product(129,"Mobiles",1,1000));
		L1.add(new Product(109,"Battery",5,3000));
		
		// Sorting by using lambda Expression
		Collections.sort(L1,(p1,p2)->(p1.getPrice()<p2.getPrice() ? +1 : -1));
		System.out.println(L1);
	}
}
