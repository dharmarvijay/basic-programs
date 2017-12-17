package myjava;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("enter the number of rows and colum");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		for(int i=number;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
