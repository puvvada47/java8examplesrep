package com.jav8.examples;

public class LambdaExpressionThread{  
    public static void main(String[] args) { 
    	
    	//0 Normal Implementation
    	
		class RunnableImplementation implements Runnable {

			@Override
			public void run() {
				System.out.println("Thread0 is running...");
			}
		}
    	
		RunnableImplementation r0=new RunnableImplementation();
		Thread t0=new Thread(r0);
		t0.start();
    	
      
        //1Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();
        
        
        //2Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start(); 
        
        
        //3Thread example with lamba
        Thread t3=new Thread(()->System.out.println("Thread3 is running..."));
        t3.start();
                
    }  
}  