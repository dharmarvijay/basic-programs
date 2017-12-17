package myjava;

import java.util.Scanner;

public class StudentMarkUsing_While {

	public static void main(String[] args) {
		System.out.println("enter district count");
		@SuppressWarnings("resource")
		Scanner scanners=new Scanner(System.in);
		int district=scanners.nextInt();
		
		int districtcount=0;
		while(districtcount<district)
		{
			districtcount++;
			int schoolcount=0;
			System.out.println("enter school count");
			int school=scanners.nextInt();
			while(schoolcount<school)
			{
		schoolcount++;
		int student=0;
		System.out.println("enter student count");
		int studentcount=scanners.nextInt();
		while(student<studentcount)
		{
			student++;
			int total=0,subjectcount=0;
			System.out.println("subject count");
			int subject=scanners.nextInt();
			System.out.println("enter mark");
			while(subjectcount<subject)
			{
				int mark=scanners.nextInt();
				total=total+mark;
				subjectcount++;
			}
			
			System.out.println(total);
		}
			}
		}

		// TODO Auto-generated method stub

	}

}
