package com.feb2025Batch.string;

public class Demo {

	
	public static void main(String[] args) {
		String str = "Hello";
		
		String str1 = "Hello";
		
		
		String str2 = new String("Hello") ;
		
		System.out.println(str == str2);
		
		System.out.println(str == str1);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println(System.identityHashCode(str1)); 
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str));
		
		
	}
}
