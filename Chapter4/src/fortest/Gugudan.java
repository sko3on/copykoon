package fortest;

public class Gugudan 
{

	public static void main(String[] args) 
	{
		// 2단에서 9단까지, 2중 for 문 사용
		for(int a = 2; a<=9; a++)
		{
			System.out.println(a + "단");
			for(int b = 1; b<=9; b++)
			{
				System.out.println(a + "*" + b + "=" + a*b);
			}
		}
				
	}

}
