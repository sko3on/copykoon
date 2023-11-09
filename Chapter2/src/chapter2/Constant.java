package chapter2;

public class Constant 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 상수(final)는 한번 초기화한 값을 변경할 수 없음, 여러문구를 고정할 때 많이 사용한다.
		final int VALUE = 0; // = 이후의 값은 리터럴(literal)이라고한다.
		System.out.println(VALUE);
		final double PI; //첫번째 값을 잡아주기전까지는 초기화할수있음
		PI = 3.14;
		final int MIN_NUM = 0;
		final int MAX_NUM = 2100000000;
		final String MESSAGE = "내일은 화창한 날입니다.";
		// 메세지는 파이널 값만 바꾸면 한번에 바뀜
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		// 일일이 하나씩 바꿔야함
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		System.out.println("오늘은 화창한 날입니다.");
		

	}

}
