package myjava;

import java.util.Scanner;

public class StateBank {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=scanner.nextInt();
		int year=2;
		if(amount<750000)
		{
			float interest=9.95f;	
			double simpleinterest=(amount*interest*year)/100;
			System.out.println(simpleinterest);
		}else
		{
			double interest=10.70;
			double simpleinterest1=(amount*interest*year)/100;
			System.out.println(simpleinterest1);
		}
		// TODO Auto-generated method stub

	}

}
