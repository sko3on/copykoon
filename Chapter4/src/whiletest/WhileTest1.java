package whiletest;

public class WhileTest1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		while(조건식) //조건식 안에 true 라고 쓴다면 무한반복이다.
//		{
//			실행문;
//			증감식;
//		}
		int i = 0;
		int sum = 0;
		while(i<=10) // 괄호 안이 true 면 계속해서 반복 실행, false 면 반복 중지
		{
			sum+=i; // sum+=i 는 sum = sum +i 와 같다. 아래 출력식 까지 실행문.
			System.out.println(sum);
			i++;	// 증감식을 넣지않으면 실행문을 무한 반복한다.
		}
		System.out.println(sum);
		
	}

}
