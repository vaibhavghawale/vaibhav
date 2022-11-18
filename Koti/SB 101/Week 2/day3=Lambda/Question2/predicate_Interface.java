/*  Q2/- Implement the following functional interfaces with some basic examples using Lambda expression

 * 1.Predicate, 2.Supplier, 3.Consumer, 4.Function.  */

package day3.Question2;

import java.util.function.Predicate;

// 1.predicate interface :boolean result
public class predicate_Interface {
public static void main(String[] args) {
	Predicate<String> checkLength=str->str.length()>5;
	System.out.println("Output: "+checkLength.test("checkLength"));
	System.out.println("Output: "+checkLength.test("chec"));
}

}


