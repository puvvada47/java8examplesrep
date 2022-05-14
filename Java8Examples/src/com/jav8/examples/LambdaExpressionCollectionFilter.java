package com.jav8.examples;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Prod{  
    int id;  
    String name;  
    float price;  
    public Prod(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionCollectionFilter{  
    public static void main(String[] args) {  
        List<Prod> list=new ArrayList<Prod>();  
        list.add(new Prod(1,"Samsung A5",17000f));  
        list.add(new Prod(3,"Iphone 6S",65000f));  
        list.add(new Prod(2,"Sony Xperia",25000f));  
        list.add(new Prod(4,"Nokia Lumia",15000f));  
        list.add(new Prod(5,"Redmi4 ",26000f));  
        list.add(new Prod(6,"Lenevo Vibe",19000f));  
          
/*        
  Stream<Prod> filtered_data=  list.stream().filter(new Predicate<Prod>() {

			@Override
			public boolean test(Prod p) {
				if(p.price > 20000)
				return true;
				return false;
			}
        	
        });*/
        
        // using lambda to filter data  
        Stream<Prod> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  