package com.cg.findmax;

import java.util.Scanner;

public class UC3_MaxOf3Strings {
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		Integer[] arr=new Integer[3];
		System.out.println("Enter three integers:");
		for(int i=0;i<3;i++) {
		 arr[i]=st.nextInt();
		}
		Integer max=arr[0];
		for(int i=1;i<3;i++) {
			if(max.compareTo(arr[i])<0)
				max=arr[i];
		}
		System.out.println("Maximum integer is:"+max);
		
		Float[] arr2=new Float[3];
		System.out.println("Enter three float values:");
		for(int i=0;i<3;i++) {
		 arr2[i]=st.nextFloat();
		}
		Float max2=arr2[0];
		for(int i=1;i<3;i++) {
			if(max2.compareTo(arr2[i])<0)
				max2=arr2[i];
		}
		System.out.println("Maximum float is:"+max2);
		
		String[] arr3=new String[3];
		System.out.println("Enter three string values:");
		for(int i=0;i<3;i++) {
		 arr3[i]=st.next();
		}
		String max3=arr3[0];
		for(int i=1;i<3;i++) {
			if(max3.compareTo(arr3[i])<0)
				max3=arr3[i];
		}
		System.out.println("Maximum string is:"+max3);
		
		st.close();		
	 }
}
