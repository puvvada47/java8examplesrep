package com.jav8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionMap {
	 public static void main(String[] args) {  
         
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        
	        //lamba
	        Stream<String> upperList=  list.stream().map(name->name.toUpperCase());
	      upperList.forEach(a->System.out.println(a));
	      
	      //withoutLamba
	      list.stream().map(new Function<String,String>(){

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.toUpperCase();
			}
	    	  
	      });
	     
	      
	      Stream<List<char[]>> streamCharArray=list.stream().map(name->Arrays.asList(name.toCharArray()));
	      List<char[]> c=  streamCharArray.flatMap(listt->listt.stream()).collect(Collectors.toList());
	     // System.out.println(c.toString());
	      
	      Stream<String[]> stringArray=list.stream().map(name->name.split(""));
	       
	      List<String> d=stringArray.flatMap(array->Arrays.stream(array)).collect(Collectors.toList());
	      System.out.println(d);
	      
	 }	    
}



