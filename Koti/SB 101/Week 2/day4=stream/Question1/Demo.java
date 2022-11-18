package day4.Question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		
		
		list.add(new Product(15,"Shirts",999,5));
		list.add(new Product(12,"Iphone",50000,1));
		list.add(new Product(20,"Laptop",57000,12));
		list.add(new Product(14,"pants",700,10));
		list.add(new Product(25,"books",500,15));
		
		list.sort((p1,p2)->(p1.getPrice()>p2.getPrice() ? 1:-1));
		
		Stream<Product> str1=list.stream();
		Stream<Product> str2=str1.filter(s -> s.getQuantity()>10);
		str2.forEach(s -> System.out.println(s));
		
//		str2.sorted((P1,P2)->(P1.getPrice()>P2.getPrice()?1:-1));
//		str2.forEach(System.out::println);
		
//		 ((Collection<Product>) str2).stream().sorted().collect(Collectors.toList());
//		 str2.forEach(System.out::println);

		
	}
}
