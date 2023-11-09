package fortest;

public class Fortest2 
{

	public static void main(String[] args) 
	{
		// 2중 for 문
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("i="+i);
			for(int j = 1; j <= 5; j++)
			{
				System.out.println("j="+j);
			}
			System.out.println();
		}
		
	}

}
