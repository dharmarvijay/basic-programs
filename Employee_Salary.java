package myjava;

import java.util.Scanner;

public class Employee_Salary {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("no of employee");
		int employeecount=s.nextInt();
		for(int employee=1;employee<=employeecount;employee++)
		{
			System.out.println(employee+"employee");
			System.out.println("say about salary per hour");
			int salry=s.nextInt();
			System.out.println("say about how many hour work");
			int time=s.nextInt();
				if(time>=40)
				{
					int salary1=40*salry;
					int a=time-40;
					int salary2= (int) (a*(1.5*salry));
					int total=salary1+salary2;
					System.out.println("total salary");
					System.out.println(total);
				}
				else if((time<40)||(time>60))
				{
				System.out.println("employee not work more then 40 hour or 60 hour");
				}
		}
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
