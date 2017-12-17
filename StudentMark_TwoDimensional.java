package myjava;

import java.util.Scanner;

public class StudentMark_TwoDimensional {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the district count");
		int district=scanner.nextInt();
		System.out.println("enter the school count");
		int school=scanner.nextInt();
		System.out.println("enter the student count");
		int student=scanner.nextInt();
		System.out.println("enter the subject count");
		int subject=scanner.nextInt();
		int[][][][] studentmarks=new int[district][school][student][subject];
		int[][][] total=new int[district][school][student];
		for(int districtcount=0;districtcount<district;districtcount++)
		{
			for(int schoolcount=0;schoolcount<school;schoolcount++)
				{
					for(int studentcount=0;studentcount<student;studentcount++)
						{
							System.out.println("enter the marks");
							for(int subjectcount=0;subjectcount<subject;subjectcount++)
								{
									studentmarks[districtcount][schoolcount][studentcount][subjectcount]=scanner.nextInt();
									total[districtcount][schoolcount][studentcount]=total[districtcount][schoolcount][studentcount]+studentmarks[districtcount][schoolcount][studentcount][subjectcount];
								}
							System.out.println(total[districtcount][schoolcount][studentcount]);
						}
				}
		}
			int max=total[0][0][0];
			for(int districtcount=0;districtcount<district;districtcount++)
				{
					for(int schoolcount=0;schoolcount<school;schoolcount++)
						{
							for(int studentcount=0;studentcount<student;studentcount++)
								{
									if(max<total[districtcount][schoolcount][studentcount])
										{
											max=total[districtcount][schoolcount][studentcount];
										}
								}
						}
			
				}
		System.out.println("maximum mark"+" "+max);

		// TODO Auto-generated method stub

	}

}
