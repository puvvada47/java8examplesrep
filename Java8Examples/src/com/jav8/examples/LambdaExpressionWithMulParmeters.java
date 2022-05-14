package com.jav8.examples;

interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionWithMulParmeters{  
    public static void main(String[] args) { 
    	
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->{
        return (a+b);
        };  
        System.out.println(ad2.add(1000,2000));
        
        Addable ad3=(b,c)->(b+c);

    }  
} 
