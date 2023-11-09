package operator;

public class OperatorTest3 
{
	// alt 키를 누르고 방향키 사용시 줄 이동가능
	// alt + ctrl 키를 누르고 방향키 사용시 복사 가능
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		int i = 10;
		int j = 20;
		System.out.println(i+=j); // i 를 i+j 해서 저장한다 : i = i+j == i+=j == 30
		System.out.println(i-=j); // i에 j를 빼서 저장 : 위에서 저장한 i 값이 30이기 때문에 i = i-j == 30-20 == 10 을 출력, 저장한다
		System.out.println(i*=j); // i에 j를 곱해서저장 : i = 10 이기때문에 i = i*j == 10*20 == 200 을 출력, 저장한다
		System.out.println(i/=j); // i에 j를 나눠서 저장 : 200/20 == 10 을 출력, 저장한다
		System.out.println(i%=j); // i를 j로 나눈 나머지를 저장 : 10%20 == 10 : 0과 나머지 10 > 10 출력
		
		
	}

}
