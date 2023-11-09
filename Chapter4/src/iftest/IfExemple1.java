package iftest;

public class IfExemple1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// tap 키로 들여쓰기 {} 안에는 반드시 한칸 듣여쓰기를 할 것
		// shift + tap : 반대로 들여쓰기
		// ctrl + shift + f : 자동 줄 맞춤
		
//		if(조건식 : true or false 가 출력되는 내용)
//		{
//			실행문;
//		}
//		else if(조건식 : if문과 다른 내용, 반드시 if문이 선행해야한다. if문과 다르게 여러번 쓸 수 있다.)
//		{
//			실행문;
//		}
//		else (if 문이 실행되지 않으면 else 문이 실행된다)
//		{
//			실행문;
//		}
		
		// else 는 사용할 경우 반드시 if 문을 끝내야한다. 적는 순서는 if > else if > else 순서이다.
		// if 문은 여러개를 쓸수도있고 if문 안에 if문을 사용할수도 있다.
		int i = 11;
		int j = 15;
		if(i > 10)
		{
			System.out.println("i는 10보다 크다.");
		}
		if(j > 10)
		{
			System.out.println("j는 10보다 크다.");
		}
		if(i > j)
		{
			String str = "i는 j보다 큽니다.";
			System.out.println(str);
		}
		else if(i < j)
		{
			String str = "i는 j보다 작습니다.";
			System.out.println(str);
		}
		else if(i < j)
		{
			String str = "i는 j보다 작습니다.2";
			System.out.println(str);
		}
		else if(i < j)
		{
			String str = "i는 j보다 작습니다.3";
			System.out.println(str);
		}
		else
		{
			String str = "i는 j와 같습니다.";
			System.out.println(str);
		}
		
		// if 문 에서 if 나 else if, else 중 하나가 실행되었을 경우 그 부분을 출력하고 if 문을 끝낸다. 
		System.out.println("프로그램이 종료되었습니다.");
		

	}

}
