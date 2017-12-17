package myjava;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		System.out.println("enter the number of rows and column");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		for(int row=number;row>0;row--)
		{
			for(int column=1;column<row;column++)
				{
					System.out.print(" ");
				}
				for(int remaining=number-row;remaining>=0;remaining--)
					{
						System.out.print("*");				
					}
					for( int bottomrow=row;bottomrow<number;bottomrow++)
						{
							System.out.print("*");
						}
							for(int column=1;column<row;column++)
							 	{
									System.out.print(" ");
								}
			System.out.println();
		 }
	   for(int bottomrow=1;bottomrow<number;bottomrow++)
	   {
		   for(int bottomcolumn=0;bottomcolumn<bottomrow;bottomcolumn++)
		   		{
			   		System.out.print(" ");
		   		}
		   		for(int remainingbottomrow=number;remainingbottomrow>bottomrow;remainingbottomrow--)
		   			{
		   				System.out.print("*");
		   			}
		   			for( int rerow1=bottomrow;rerow1<number-1;rerow1++)
		   				{
		   					System.out.print("*");
		   				}
						for(int column=1;column<bottomrow;column++)
							{
		   						System.out.print(" ");
		   					}
			System.out.println();	   
	   }
		// TODO Auto-generated method stub

	}

}
