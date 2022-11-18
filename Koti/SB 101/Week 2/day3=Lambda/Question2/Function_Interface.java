
// 3.Function Interface: both input and output
package day3.Question2;

import java.util.function.Function;

public class Function_Interface {

	public static void main(String[] args) {
		Function<Integer, String> getInt=t->t*10 +" data multyplied by 10";
		System.out.println(getInt.apply(2));
	}
}
