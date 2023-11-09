package fortest;

public class Fortest3 
{

	public static void main(String[] args) 
	{
		// continue 문
		// 반복문 안에서 continue 만나면 나머지 코드를 실행하지않고 다음 반복을 실행
		
		// 2 의 배수만 출력하는 반복문
		for(int i = 1; i <= 100; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);		
			} 
		}
		System.out.println("---------------------------------------");
		
		// 2의 배수를 제외한 숫자를 출력하는 반복문
		for(int i = 1; i <= 100; i++)
		{
			if(i%2 == 0)
			{
				continue; // continue 를 만나면 증감식으로 넘어가게 됨
			} 
			System.out.println(i);		
		}
		System.out.println("---------------------------------------");
	
		for(int i = 1; i <= 100; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);		
			} 
		}
		System.out.println("---------------------------------------");
		
		// break 문
		// 반복문 안에서 break; 를 만나면 반복문을 종료
		int sum = 0;
		int i = 0;
		for(i = 1; i <=100; i++)
		{
			if(sum >= 55)
			{
				break; // 몇번 반복해야할지 모를때, 특정한 조건이 있을 때 사용한다.
			}
			sum += i;
		}
		System.out.println(sum + "이 될 때 까지 더한 횟수 = " + i);
		System.out.println(sum);
		
		
	}

}
