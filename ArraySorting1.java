package myjava;

import java.util.Scanner;

public class ArraySorting1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no. of element in array");
		int n=s.nextInt();
		int[] number=new int[n];
		System.out.println("enter the number");
		for(int a=0;a<number.length;a++)
			{
				number[a]=s.nextInt();
			}
		for(int k=0;k<number.length;k++)
			{
				for(int i=0;i<number.length-1;i++)
					{
						if(number[i]>number[i+1])
							{
								int temp=number[i];
								number[i]=number[i+1];
								number[i+1]=temp;
							}
					}	
			}
		for(int i=0;i<number.length;i++)
			{
				System.out.print(number[i]+",");
			}
		// TODO Auto-generated method stub

	}

}
