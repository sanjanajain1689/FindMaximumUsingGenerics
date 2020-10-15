package com.cg.findmax;
import java.util.*;

public class UC1_MaxOf3Integers {
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
	
	st.close();		
 }
}
