package myjava;

import java.util.Scanner;

public class StudentMark_Array {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int totalcount=0;
		int[] district=new int[2];
		int[] school=new int[1];
		int[] student=new int[5];
		int[] total=new int[100];
		int[] marks=new int[5];
		for(int districtcount=0;districtcount<district.length;districtcount++)
		{
			for(int noofschool=0;noofschool<school.length;noofschool++)
			{
					for(int studentcount=0;studentcount<student.length;studentcount++)
					{
						System.out.println("enter the marks");
							for(int noofsubject=0;noofsubject<marks.length;noofsubject++)
							{
								marks[noofsubject]=scanner.nextInt();
								total[totalcount]=total[totalcount]+marks[noofsubject];
							}
						
						System.out.println("total is"+" "+total[totalcount]);
						totalcount++;
					}
			}
			
		}
						int max=total[0];
							for(int numberoftotal=0;numberoftotal<totalcount;numberoftotal++)
							{
								if(max<total[numberoftotal])
								{
									max=total[numberoftotal];
								}	
							}
		System.out.println("highest mark is");
		System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}
