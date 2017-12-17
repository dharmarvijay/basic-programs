package myjava;

import java.util.Scanner;

public class StudentMarkUsing_DoWhile {

	public static void main(String[] args) {
		System.out.println("enter the district count");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int district=scanner.nextInt();
			
			do{
				System.out.println("enter the institute count");
				int institute=scanner.nextInt();
				district=district-1;
				do{
				System.out.println("enter the student count");
				int student=scanner.nextInt();
				do{
							System.out.println("enter the semester count");
							int semaster=scanner.nextInt();
			             		do{
			             		int total=0;
			             		System.out.println("enter the subject count");
			             		int subjectcount=scanner.nextInt();
			             		System.out.println("enter the mark");
			             		
			             		do{
			             				int marks=scanner.nextInt();
			             			total=total+marks;
			             			subjectcount=subjectcount-1;	
			             		   }
			            		while(subjectcount>0);
			             	
			             		System.out.println(total);
			             		{
			             			semaster=semaster-1;
			            		 
			           		   }
			             		}
			             		while(semaster>0);
			             		{
			             			student=student-1;
			             		}
						    }
						while(student>0);
						{
							institute=institute-1;
						}
			}
			while(institute>0);
			
			
			}while(district>0);
		// TODO Auto-generated method stub

	}

}
