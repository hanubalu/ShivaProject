package com.ArraysOfEmailIDsOfEmployee;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArraysOfEmailIDsOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter vaild email ");  
			 String str= scan.nextLine();   
			 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));
		}

	}
}
