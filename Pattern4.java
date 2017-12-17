package myjava;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		for(int row=1;row<number;row++)
		{
			for(int colum=number;colum>row;colum--)
			{
				System.out.print(row+" ");
			}System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
