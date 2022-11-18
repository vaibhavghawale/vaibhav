package day4.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(15);
	list.add(30);
	
	Stream<Integer> s1=list.stream();
	s1.map(i->i*2).forEach(i->System.out.print(i+" "));
	
//	Another way
//	list.stream().map(i->i*2).forEach(i->System.out.print(i+" "));
}
}
