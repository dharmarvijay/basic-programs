package myjava;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int row=0;row<number;row++)
		{
			for(int column=0;column<=row;column++)
			{
				System.out.print("*");
			}
			for(int remaining=number-row;remaining>0;remaining--)
			{
			System.out.print("#");
			}
		
		System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
