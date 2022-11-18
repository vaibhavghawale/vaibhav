
// 2.Consumer Interface :It consumes data for modification and no output
package day3.Question2;

import java.util.function.Consumer;

class Person {
	String name;
	
	public String getName() {
		return name;
	 }
	public void setName(String name) {
		this.name = name;
	}
}

public class Consumer_Interface {
  public static void main(String[] args) {
	  Person p=new Person();
	   Consumer<Person> setName=t->t.setName("Play Java");
	   setName.accept(p);
	   System.out.println(p.getName());
}
}
