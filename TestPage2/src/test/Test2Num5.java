package test;

public class Test2Num5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		int d = 5;
		String str = "*";
		for(a=0 ; a<=7 ; a++)
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
		System.out.println();
		
		//풀이
		int sub = 3;
		for(int i = 4; i<=7; i++)
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

	}

}
