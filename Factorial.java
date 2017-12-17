package myjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		long number=s.nextLong();
		for(long i=number-1;i>0;i--)
		{
			number=number*i;
		}
		System.out.println("factorial is");
		System.out.println(number);
		// TODO Auto-generated method stub

	}

}
