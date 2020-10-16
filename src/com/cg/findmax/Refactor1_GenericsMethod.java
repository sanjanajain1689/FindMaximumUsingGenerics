package com.cg.findmax;

public class Refactor1_GenericsMethod {
	public static < E extends Comparable<E>> void largestElement( E[] a ) {
		   E max=a[0];
	       for(int e=1;e<a.length;e++) {
	        if(max.compareTo(a[e])<0)
	        	max=a[e];
	        }
	      System.out.println("MAX is:"+max);
	      }

	   public static void main(String args[]) {
	       Integer[] intArray = {2,1,5};
	       Float[] fltArray = {100.0f,25.0f,30.0f};
           String[] stringArray={"Dog","Horse","Elephant"};
	       largestElement(intArray);  
	       largestElement(fltArray);
	       largestElement(stringArray);
	       }
}
