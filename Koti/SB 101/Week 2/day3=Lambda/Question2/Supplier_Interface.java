
//4.Supplier:It does not take any argument.It gives output
package day3.Question2;

import java.util.function.Supplier;

public class Supplier_Interface {
public static void main(String[] args) {
	Supplier<Double> getRandomDouble=()->Math.random();
	System.out.println(getRandomDouble.get()); //no input
 }
		
}
