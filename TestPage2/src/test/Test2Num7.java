package test;

public class Test2Num7
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int d = 5;
		String str = "*";
		for(a=0 ; a<=5 ; a++)
		{			
			if(a%2 !=0) 
			{
				
				for(int c= 0; c<=d ; c++) 
				{
					d--;
					System.out.print(" ");
				}
				for(b=1; b<=a; b++)
				{
					System.out.print(str);
				}
				System.out.println();
			}
			
		}
		for(a=0 ; a<=7 ; a++)
		{
			
			if(a%2 ==0) 
			{	
				for(d=2; d<=a; d++)
				{
					d++;
					System.out.print(" ");
				}
				for(b=7; b>a; b--)
				{
					System.out.print(str);
				}
				System.out.println();
			}
		}
		//풀이
		System.out.println();
		int sub=3;
		for(int i = 4; i<=6; i++)
		{
			for(int j = 0; j<i; j++)
			{
				if(j<sub)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}
		sub = 0;
		for(int i = 7; i>=4; i--)
		{
			for(int j = 0; j<i; j++)
			{
				if(j<sub)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			sub++;
			System.out.println();
		}
	}


}

