package com.masai;

import org.springframework.stereotype.Component;

@Component //Register with container
public class A {  //Id of this class is small a
  public void funA() {
	System.out.println("Inside funA of A");
}
}
