package myjava;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=number-i;k>0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
