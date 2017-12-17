package myjava;

public class BiggestNumber_withoutArrayUsingAmbertion {

	public static void main(String[] args) {
		int a=3,b=3,c=3,d=3;
		
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("a is biggest a="+a);
		}
		else if((b>a)&&(b>c)&&(b>d))
		{
			System.out.println("b is biggest b="+b);
		}
		else if((c>a)&&(c>b)&&(c>d))
		{
			System.out.println("c is biggest c="+c);
		}
		else if((d>a)&&(d>b)&&(d>c))
		{
			System.out.println("d is biggest d="+d);
		}
		else if((a==b)&&(a>c)&&(a>d))
		{
			System.out.println("a and b are equal and biggest");
			System.out.println("a="+a+","+"b="+b);
		}
		else if((a>b)&&(a==c)&&(a>d))
		{
			System.out.println("a and c are equal and biggest");
			System.out.println("a="+a+","+"c="+c);
		}
		else if((a>b)&&(a>c)&&(a==d))
		{
			System.out.println("a and d are equal and biggest");
			System.out.println("a="+a+","+"d="+d);
		}
		else if((b==c)&&(b>a)&&(b>d))
		{
			System.out.println("b and c are equal and biggest");
			System.out.println("b="+b+","+"c="+c);
		}
		else if((b>c)&&(b>a)&&(b==d))
		{
			System.out.println("b and d are equal and biggest");
			System.out.println("b="+b+","+"d="+d);
		}
		else if((c>a)&&(c>b)&&(c==d))
		{
			System.out.println("c and d are equal and biggest");
			System.out.println("c="+c+","+"d="+d);
		}
		else if((a==b)&&(a==c)&&(a==d))
		{
			System.out.println("a and b and c and d are equal");
			System.out.println("a="+a+","+"b="+b+","+"c="+c+","+"d="+d);
		}
		else if((a>b)&&(a==c)&&(a==d))
		{
			System.out.println("a and c and d are equal and biggest");
			System.out.println("a="+a+","+"c="+c+","+"d="+d);
		}
		else if((b>a)&&(b==c)&&(b==d))
		{
			System.out.println("b and c and d are equal and biggest");
			System.out.println("b="+b+","+"c="+c+","+"d="+d);
		}
		else if((b==d)&&(b>c)&&(b==d))
		{
			System.out.println("a and b and d are equal and biggest");
			System.out.println("a="+a+","+"b="+b+","+"d="+d);
		}


		// TODO Auto-generated method stub

	}

}
