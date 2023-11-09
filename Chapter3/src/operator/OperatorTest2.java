package operator;

public class OperatorTest2 
{
	// alt 키를 누르고 방향키 사용시 줄 이동가능
	// alt + ctrl 키를 누르고 방향키 사용시 복사 가능
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 관계 연산자, 비교 연산자 : >, <, >=, <=, ==, !=
		// 관계 연산자 와 비교 연산자는 반드시 true, false 로 출력된다
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1>num2); // 항1 이 항2 보다 크다
		System.out.println(num1<num2); // 항1 이 항2 보다 작다
		System.out.println(num1>=num2); // 항1 이 항2 보다 크거나 같다
		System.out.println(num1<=num2); // 항1 이 항2 보다 작거나 같다
		System.out.println(num1==num2); // 항1 이 항2 와 같다
		System.out.println(num1!=num2); // 항1 이 항2 가 다르다
		System.out.println("------------------------------------------------------------");
		
		// 논리 연산자 : &&, ||(shift+\), !  : if 문에서 많이 사용한다
		System.out.println(true && true); // &&는 양쪽의 항이 둘다 true 이면 true를 출력한다
		System.out.println(1<2 && 10==10); 
		System.out.println("------------------------------------------------------------");
		System.out.println(true && false); 
		System.out.println(false && true); 
		System.out.println(false && false); 
		System.out.println("------------------------------------------------------------");
		System.out.println(true || true); // ||는 두개의 항중에 하나라도 true 값이 있다면 true를 출력한다
		System.out.println(1<2 || 10==10);
		System.out.println("------------------------------------------------------------");
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("------------------------------------------------------------");
		System.out.println(!true); // !는 출력값을 반대로 출력한다
		System.out.println(!(10>20));
		System.out.println(!false);
		
		
	}

}
