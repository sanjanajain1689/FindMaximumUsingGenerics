package com.cg.findmax;

public class UC4_GenericsMethod {
	public static < E extends Comparable<E>> void largestElement( E[] a ) {
		   E max=a[0];
	       for(int e=1;e<a.length;e++) {
	        if(max.compareTo(a[e])<0)
	        	max=a[e];
	        }
	      System.out.println("MAX is:"+max);
	      }

	   public static void main(String args[]) {
	       Integer[] intArray = { 1, 2, 3, 4, 5 };
	       Float[] fltArray = { 100.0f,25.0f,30.0f,45.0f};
           String[] stringArray={"Dog","Horse","Elephant","Bat","Monkey"};
	       largestElement(intArray);  
	       largestElement(fltArray);
	       largestElement(stringArray);
	       
	   }
}
