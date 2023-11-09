package whiletest;

public class WhileTest2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		while(조건식) //조건식 안에 true 라고 쓴다면 무한반복이다.
//		{
//			실행문;
//			증감식;
//		}
		// 50부터 100까지의 숫자를 더하는 프로그램
		int i = 50;
		int sum = 0;
		while(i <= 100)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		// do - while 문
//		do
//		{
//			실행문;
//			증감식;
//		}
//		while(조건식);
		
		// do - while 문은 do 안의 식이 먼저 실행되고, 이후에 while 의 조건식이 실행된다. while문 안에 조건식이 false 더라도 반드시 한번은 실행된다.
		int number = 1;
		int sum2 = 0;
		do
		{
			sum2 += number; // 실행문
			number++; // 증감식
		}while(number<=10); // 조건식
		System.out.println(sum2);
		
	}

}
