package chapter2;

public class Conversion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 묵시적 형 변환 ex) byte>int 변환
		// 바이트 크기가 작은 자료형에서 큰 자료형으로 자동변환
		byte value = 127; // 1바이트
		int value2 = value+1; // 4바이트
//		byte value3 = value2; //큰 자료형을 작은 자료형에 저장하는것은 불가능 ex) byte>int 가능, int>byte 불가능
		System.out.println(value2);
		
		//덜 정밀한 자료형에서 더 정밀한 자료형으로 자동 변환(정밀하다는 뜻은 소수점을 뜻함> 덜 정밀:정수만표형, 더 정밀:소숫점도 표현)
		int iNum = 10;
		float fNum = iNum;
//		iNum = fNum; // 더 정밀한 자료형을 덜 정밀한 자료형에 저장하는 것은 불가능
		System.out.println(fNum);
		
		double dNum = fNum + value2 + iNum;
		System.out.println(dNum); // float 과 int 는 double 에 저장이 가능하다.
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		// 명시적 형 변환, 캐스트, 캐스팅
		int iNum3 = (int)dNum1 + (int)fNum2; // (int)를 넣으면 각 숫자의소수점자리를 '버림' 해서 변환한다.
		System.out.println(iNum3);
		int iNum4 = (int)(dNum1 + fNum2); // ()를 이용해서 미리 더한 후 (int)를 사용해서 변환하면 조금 더 정밀하게 변환이 가능하다.
		System.out.println(iNum4);
		
		// 두개의 변수를 선언하여 10과 2.0을 대입한 후 두개의 값을 더한 결과를 정수로 출력해보세요.
		int a = 10;
		float b = 2.0f;
		System.out.println((int)(a+b));
		int c = (int)(a + b);
		System.out.println(c); // 코딩에있어서 잘한다고 하는것은 가독성이 좋고, 줄의 수를 줄이는것이다.
		
		
	}

}
