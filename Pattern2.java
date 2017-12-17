package myjava;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("enter the number of rows and coloum");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int row=1;row<=number;row++)
		{
			for(int coloum=1;coloum<=row;coloum++)
			{
				if(row==coloum)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
