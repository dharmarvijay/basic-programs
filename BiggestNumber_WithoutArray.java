package myjava;

public class BiggestNumber_WithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=6,c=8,d=6,e=8;
		{
		if(a>b)
		{
			if(a>c) 
			{
				if(a>d) 
				{
					if(a>e)
					{
						System.out.println("a is biggest");
						System.out.println("a="+a);
					}
					    else if(a==e)
						{
					    	System.out.println("a and e are equal and biggest");
							System.out.println("a="+a+"\n"+"e="+e);
						}
						else
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
				}
				
					else if(a==d)
					{
						if(d>e) 
						{
							System.out.println("a and d are equal and biggest");
							System.out.println("a="+a+"\n"+"d="+d);
						}
						else if(d==e)
						{
							System.out.println("a and d and e are equal and biggest");
							System.out.println("a="+a+"\n"+"d="+d+"\n"+"e="+e);
						}
						else 
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
					}
					else if (a<d) 
						{
							if(d>e) 
							{
								System.out.println("d is biggest");
								System.out.println("d="+d);
							}
							else if(d==e) 
							{
								System.out.println("d and e are equal and biggest");
								System.out.println("d="+d+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
			}
				else if(a==c)
					{
						if(c>d) 
						{
							if(c>e)
							{
								System.out.println("c is biggest");
								System.out.println("c="+c);
							}
							else if(c==e) 
							{
								System.out.println("a and c and e are equal and biggest");
								System.out.println("a="+a+"\n"+"c="+c+"\n"+"e="+e);
							}
							else 
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
						else if(c==d)
						{
							if(d>e)
							{
								System.out.println("a and c and d are equal and biggest");
								System.out.println("a="+a+"\n"+"c="+c+"\n"+"d="+d);
							}
							else if(d==e)
							{
								System.out.println("a and c and d and e are equal and biggest");
								System.out.println("a="+a+"\n"+"c="+c+"\n"+"d="+d+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
							else if(c<d)
							{
								if(d>e)
								{
									System.out.println("d is biggest");
									System.out.println("d="+d);
								}
								else if(d==e)
								{
									System.out.println("d and e are equal and biggest");
									System.out.println("d="+d+"\n"+"e="+e);
								}
								else
								{
									System.out.println("e is biggest");
									System.out.println("e="+e);
								}
							}
						}
					}
					else if(a<c)
					{
						if(c>d)
						{
							if(c>e)
							{
								System.out.println("c is biggest");
								System.out.println("c="+c);
							}
							else if(c==e)
							{
								System.out.println("c and e are equal and biggest");
								System.out.println("c="+c+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
							else if(c==d)
							{
								System.out.println("c and d are equaland biggest");
								System.out.println("c="+c+"\n"+"d="+d);
							}
							else if(d==e)
							{
								System.out.println("c and d and e are equal and biggest");
								System.out.println("c="+c+"\n"+"d="+d+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
			else if(a==b)
			{
				if(b>c)
				{
					if(b>d)
					{
						if(b>e)
						{
							System.out.println("a and b are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b);
						}
						else if(b==e)
						{
							System.out.println("a and b and e are equal and biggest");
							System.out.println("a"+a+"\n"+"b="+b+"\n"+"e="+e);
						}
						else
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
					}
					else if(b==d)
					{
						if(d>e)
						{
							System.out.println("a and b and d are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"d="+d);
						}
						else if(d==e)
						{
							System.out.println("a and b and d and e are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"d="+d+"\n"+"e="+e);
						}
						else
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
					}
				}
				else if(b==c)
				{
					if(c>d)
					{
						if(c>e)
						{
							System.out.println("a and b and c are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c);
						}
						else if(c==e)
						{
							System.out.println("a and b and c and e are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c+"\n"+"e="+e);
						}
						else
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
					}
					else if(c==d)
					{
						if(d>e)
						{
							System.out.println("a nad b and c and d are equal and biggest");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c+"\n"+"d="+d);
						}
						else if(d==e)
						{
							System.out.println("a and b and c and d and e are same");
							System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c+"\n"+"d="+d+"\n"+"e="+e);
						}
						else
						{
							System.out.println("e is biggest");
							System.out.println("e="+e);
						}
					}
				}
			}
				else if(a<b)
				{
					if(b>c)
					{
						if(b>d)
						{
							if(b>e)
							{
								System.out.println("b is biggest");
								System.out.println("b="+b);
							}
							else if(b==e)
							{
								System.out.println("b and e are equal and biggest");
								System.out.println("b="+b+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is bggest");
								System.out.println("e="+e);
							}
						}
						else if(b==d)
						{
							if(d>e)
							{
								System.out.println("b and d are equal and biggest");
								System.out.println("b="+b+"\n"+"d="+d);
							}
							else if(d==e)
							{
								System.out.println("b and d and e are equal and biggest");
								System.out.println("b="+b+"\n"+"d="+d+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
					}
					else if(b==c)
					{
						if(b>d)
						{
							if(b>e)
							{
								System.out.println("b and c are equal and biggest");
								System.out.println("b="+b+"\n"+"c="+c);
							}
							else if(b==e)
							{
								System.out.println("b and c and e are equal and biggest");
								System.out.println("b="+b+"\n"+"c="+c+"\n"+"e="+e);
							}
							else
							{
								System.out.println("e is biggest");
								System.out.println("e="+e);
							}
						}
						else if(b==d)
						{
							if(d>e)
							{
								System.out.println("b and c and d are equal and biggest");
								System.out.println("b="+b+"\n"+"c="+c+"\n"+"d="+d);
							}
							else if(d==e)
							{
								System.out.println("b and c and d and e are equal and biggest");
								System.out.println("b="+b+"\n"+"c="+c+"\n"+"d="+d+"\n"+"e="+e);
							}
						}
					}
				}
		}

	}

}
