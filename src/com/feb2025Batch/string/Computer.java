package com.feb2025Batch.string;

public class Computer {

	public static void main(String[] args) {

		String str = "  " ;

		StringBuffer stringBuffer = new StringBuffer("See ");

		stringBuffer.append("You");

		System.out.println(stringBuffer);
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toLowerCase());
	}
}
