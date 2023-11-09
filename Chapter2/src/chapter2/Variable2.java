package chapter2;

public class Variable2 
{
	public static void main(String[] args)
	{
		// 정수 자료형
		byte b = -128; // 1바이트 : -128 ~ +127 까지의 숫자표시
		short s = -32768; // 2바이트 : -32768 ~ +32767 까지의 숫자표시
		int i = 2147483647; // 4바이트 : -2147483648 ~ +2147483647 까지의 숫자 표시
		long l = 9223372036854775807L; // 8바이트 : -9223372036854775808 ~ +9223372036854775807 (4바이트의 2제곱 만큼의 숫자 표시), 4바이트 초과하는 숫자사용시 영어 l or L 을 적어줘야 사용가능함
		// ctlr + space : 자동완성 ex) syso 타이핑 후 ctlr + space >> System.out.println();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		// 한 글자만 표시하는 자료형 char(Character)
		char c = 65; // 한 글자만 표시하는 자료형 char(Character), char 안의 코드는 모두 아스키코드로 표현되어서 나온다.
		System.out.println(c);
		char k = '가'; //한글 변환
		System.out.println((int)k);
		char k2 = '가'+1;//실제로 숫자로 이루어져있음
		System.out.println(k2);
		
		//여러 글자를 표시하는 자료형 String(기본 자료형 x)
		String str = "String 자료형은 문자열을 저장합니다."; // 문자는 반드시 "" 를 적어줘야함
		System.out.println(str);
		
		//실수 자료형
		float f = 0f; // long자료형과 같이 뒤에 문자(f or F)를 붙여줘야한다. 4바이트 자료형
		double d = 1; // 8바이트 자료형
		System.out.println(f);
		System.out.println(d);
		
		for(int i2=0; i2<10; i2++)
		{
			d = d + 0.1;
		}
		System.out.println(d); // 부동소숫점(실수)은 정확한 계산이 어렵다
		
		//논리 자료형 불린 : 1byte 크기이지만 true(참) 혹은 false(거짓) 둘 중 하나만 저장가능
		boolean bo = true; 
		System.out.println(bo);
		boolean bo2 = false;
		System.out.println(bo2);
		
		//자동으로 자료형을 설정해주는 자료형 var, 반드시 함수안에서만 사용이 가능하다.(가급적 사용X)
		var v1 = 10;
		var v2 = 10.0;
		var v3 = 'a';
		var v4 = true;
		var v5 = 1.12f;
		var v6 = 100012345654L;
		var v7 = "string 자료형";
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
	}
	
}