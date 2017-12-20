package myjava;

import java.util.Scanner;

public class Sorting_String {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String name=s.next();
		char vijay[]=new char[name.length()];
		System.out.println("sorting string");
		for(int i=0;i<name.length();i++)
		{
			vijay[i]=name.charAt(i);
		}
		for(int i=0;i<vijay.length;i++)
			{
				for(int j=0;j<vijay.length-1; j++)
					{
						if(vijay[j]>vijay[j+1])
							{
								char temp=vijay[j];
								vijay[j]=vijay[j+1];
								vijay[j+1]=temp;
							}
					}
			}
		for(int i=0;i<vijay.length;i++)
			{
				System.out.print(vijay[i]);
			}

		// TODO Auto-generated method stub

	}

}
