package com.jav8.examples;

import java.util.*;
import java.util.function.Consumer;

public class LambdaExpressionForEach {
	 public static void main(String[] args) {  
         
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	  
	       //Normal Impementation
		class ConsumerImplementation implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		}
	        
	     ConsumerImplementation consumerImpl=new ConsumerImplementation();
	     System.out.println("================Normal Impementation");
	    list.forEach(consumerImpl);
	     System.out.println("==========================End NI");
	        
	        
	        
	       //using anonymous class 
	     System.out.println("================anonymous class");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		}
	        );
	        System.out.println("==========================End AC");
	        
	        
	        //Lamba Expressions
	        System.out.println("================Lamba Expressions");
		list.forEach((n) -> {
			System.out.println(n);
		}); 
	        System.out.println("==========================End LE");
	    }  

}



/*
 * internal implementation of foreach

default void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
        action.accept(t);
    }
}*/
