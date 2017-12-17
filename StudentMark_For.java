package myjava;

import java.util.Scanner;

public class StudentMark_For {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("enter number of district count");
		int district=reader.nextInt();
		int[] dis=new int[district];
		for(int districtcount=0;districtcount<dis.length;districtcount++)
		{
			System.out.println("enter school count");
			int schoolcount=reader.nextInt();
			int[] sch=new int[schoolcount];
			for(int school=1;school<=sch.length;school++)
			{
				System.out.println("enter student count");
				int studentcount=reader.nextInt();
				int[] stu=new int[studentcount];
				for(int student=1;student<=stu.length;student++)
	 			{
					
					int total=0,subject;
					System.out.println("subject count");
					int subjectcount=reader.nextInt();
					int[] marks=new int[subjectcount];
					for(subject=0;subject<marks.length;subject++)
					{
						System.out.println("enter the marks");
						 marks[subject]=reader.nextInt();
						total=total+marks[subject];
					}
					System.out.println("total");
					System.out.println(total);
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
