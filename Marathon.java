package myjava;

public class Marathon {

	public static void main(String[] args) {
		String[] name= {"kumar","murali","rajesh","julie","palani","mari","alex","siva","pradeep","gugan","david","ahmad","danial","mani","balu","ismali"};
		int[] number= {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				
				if(number[i]>number[j])
					{
						int temp=number[i];
						number[i]=number[j];
						number[j]=temp;
						String temp1=name[i];
						name[i]=name[j];
						name[j]=temp1;
						
					}
			}
		}
		int count=0;
		for(int i=0;i<2;i++)
			{
				count++;
				System.out.println( count+" person");
				System.out.println(name[i]+":"+number[i]+"(min)");
		
			}

		// TODO Auto-generated method stub

	}

}
