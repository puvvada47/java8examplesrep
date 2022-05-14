package com.jav8.examples;

import java.util.*;

class Product{  
    int id;  
    String name;  
    float price;
    long inch;
    
    public Product(int id, String name, float price,long inch) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;
        this.inch=inch;
    }  
}  

public class LambdaExpressionComparator{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
          
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f,20L));  
        list.add(new Product(3,"Keyboard",300f,21L));  
        list.add(new Product(2,"Dell Mouse",150f,25L));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(product1,product2)->{  
        return product1.name.compareTo(product2.name);  
        }
        );  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
    }  
}  
