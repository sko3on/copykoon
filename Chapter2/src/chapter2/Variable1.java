package chapter2;

public class Variable1
{
	public static void main(String [] args)
	{
		// 자료형 변수이름(명), 이름은 level 뿐만아니라 어떤것을 적어도 상관이없다.; 선언
		int level = 10;
		// 변수명 = 숫자; 초기화
		System.out.println(level);
		int level1 = 100;
		System.out.println(level1);
		int level2 = 1000;
		System.out.println(level2);
		// 변수명 작성 규칙
		// 1. 변수 이름은 영문자나 숫자를 사용할 수 있고 특수분자 중에서 $, _ 만 사용할 수 있음
		// 2. 변수 이름은 숫자로 시작할 수 없음
		// 3. 자바에서 이미 사용중인 예약어는 사용할 수 없음(보라색으로 나타남)

		// 표기법
		// 카멜 표기법(변수, 메서드) : 첫 단어의 첫 글자는 소문자로 나머지 단어의 첫글자는 대문자로 작성 ex) studentNumber
		// 파스칼 표기법(클래스명) : 첫단부터 다른단어의 모든 첫 글자는 대문자로 작성 ex) StudentNumber
		// 언더스코어 표기법(상수, 데이터베이스의 필드명) : 단어의 사이에 _ 를 넣어서 작성 ex) student_number
		
		int level4;	//초기화
		level4=0;	//대입
		System.out.println(level4);	//출력
		
	}
}
