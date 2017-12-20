package myjava;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String name=s.next();
		String name2="";
		char[] name1=new char[name.length()];
		for(int i=name.length()-1;i>=0;i--)
			{
				name1[i]=name.charAt(i);
				name2=name2+name1[i];
			}
		if(name.equals(name2))
			{
				System.out.println("it is a palindrom");
			
			}
			else
			{
			System.out.println(" it is a not palindrom");
			}
	

		// TODO Auto-generated method stub

	}

}
