package operator;

public class OperatorTest4 
{
	// alt 키를 누르고 방향키 사용시 줄 이동가능
	// alt + ctrl 키를 누르고 방향키 사용시 복사 가능
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 조건 연산자, 삼항 연산자 : 간단하게 식이 참이냐 거짓이냐를 판별하고싶을 때 사용
		//      조건식 ? true : false
		int i = 10>20 ? 10 : 20; // 앞의 조건식을 true 혹은 false로 계산 ? 이후의 a : b 중 true면 i=a, false면 i=b 
		System.out.println(i); // 10>20 이 false 이므로 10 : 20 에서 false 값 20 출력
		int i1 = 10<20 ? 10 : 20; // 앞의 조건식을 true 혹은 false로 계산 ? 이후의 a : b 중 true면 i=a, false면 i=b 
		System.out.println(i1); // 10>20 이 true 이므로 10 : 20 에서 true 값 10 출력
		//           조건식 ? true : false
		String str = 10>20 ? "참" : "거짓";
		System.out.println(str); // 10>20 이 false 이므로 "참" : "거짓" 에서 false 값 "거짓" 출력
		
		// 연산자의 우선순위
		// 1순위. (), [], .
		// 2순위. !, ++, --, -, + : 앞에 붙었을 때(ex ++2, --2 -2, +2)
		// 3순위. %, /, *
		// 4순위. +, -
		// 5순위. <, >, <=, >=
		// 6순위. &&
		// 7순위. ||
		// 8순위. ? : (조건 연산자)
		// 9순위. =, +=, -= *=, /= (대입 연산자)
		// 10순위. ++, -- : 뒤에 붙었을 때(ex 2++, 2--)
		int result = 10+1+10*2-10/2+10; // 10+1+10*2-10/2+10 = 10+1+20-5+10 의 결과값 도출 > 36
		System.out.println(result);
		int result2 = 10+1+10*2-10/2+10 > 10 ? 0 : 1 ; // 위의 식을 보면 36 > 10 ? 0 : 1; 으로 변환된다. 삼항 연산자 사용으로 0 출력
		System.out.println(result2);
		int result3 = (-10)+(-1)+(10*2)-(10/2)+10; // 괄호를 사용하면 훨씬 쉽게 식 연산이 가능하다.(가독성 증가)
		System.out.println(result3);
		
		
	}

}
