package com.dm.javaprograms;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstVar = sc.nextInt();
		int secondVar = sc.nextInt();
		System.out.println("Before Swapping "+firstVar+ " "+secondVar);
		//Logic 1
		/*int temp = firstVar;
		firstVar = secondVar;
		secondVar = temp;
		System.out.println("After Swapping"+firstVar+ " "+secondVar);*/
		
		//Logic 2
		firstVar = firstVar+secondVar;
		secondVar = firstVar-secondVar;
		firstVar = firstVar-secondVar;
		System.out.println("After Swapping"+firstVar+ " "+secondVar);
	}

}
