package test;

public class Test2Num6
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		int b = 0;
		int d = 7;
		String str = "*";
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
		int sub = 0;
		System.out.println();
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
