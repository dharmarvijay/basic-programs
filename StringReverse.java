package myjava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String name=s.next();
		char[] vijay=name.toCharArray();
		for(int i=vijay.length-1;i>=0; i--)
			{
				System.out.print(vijay[i]);
			
			}
		// TODO Auto-generated method stub

	}

}
