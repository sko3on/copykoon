package classtest;

public class FunctionTest 
{
	// 1부터 파라미터로 받아온 값까지 더해주는 메서드를 작성해보세요.
	int fac(int value)
	{
		int result = 0;
		for(int a = 1 ; a<=value ; a++)
		{
			result+=a;
		}
		return result;
	}
	// 사칙연산을 실행하는 메서드 작성
	int add(int x, int y)
	{
		int result = x+y;
		return result;
	}
	int mn(int x, int y)
	{
		int result = x-y;
		return result;
	}
	int dp(int x, int y)
	{
		int result = x*y;
		return result;
	}
	int dm(int x, int y)
	{
		int result = x/y;
		return result;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FunctionTest num = new FunctionTest();
		System.out.println(num.fac(10));
		System.out.println(num.add(20, 10));
		System.out.println(num.mn(20, 10));
		System.out.println(num.dp(20, 10));
		System.out.println(num.dm(20, 10));
		
	}

}
