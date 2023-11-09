package fortest;

public class Fortest1 
{

	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;
		for(i = 0; i <= 10; i++) //for(초기화식; 조건식; 증감식), for 문은 1.초기화식, 2.조건식, 3.실행문, 4.증감식 순서로 실행된다.
		{
			sum+=i; // 실행문;
		}
		System.out.println(sum);
		
		// 초기화식 생략 : 초기화식을 반드시 위의 다른곳에 적어 두어야함.
		for( ; i <= 10; i++)
		{
			sum+=i; // 실행문;
		}
		System.out.println(sum);
		
		// 조건식 생략 : 반복문 안에서 break문을 이용하여 종료(break를 걸어야할 경우가 많을 때 사용)
		for(int j=0; ; i++) // j 를 처음 선언할때 초기화까지 완료함, for문 안에서만 j 사용 가능
		{
			if(j<=10) 
			{
				break;
			}
			sum+=j;
		}
		System.out.println(sum);

		// 증감식 생략 : 중괄호 안의 실문을 적는 공간에 증감식을 적어 반복문을 완성해야함
		for(int k=0; k<=10; )
		{
			sum += k;
			k++;
		}
		System.out.println(sum);
		
//		for(;;)
//		{
//			System.out.println("모든 내용을 생략 : 무한 반복");
//		}
	}

}
