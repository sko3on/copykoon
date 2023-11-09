package operator;

public class OperatorTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 대입 연산자, 변수에 값을 대입하는 역할 'ex) = ', 왼쪽항은 결과값 오른쪽항은 데이터값 'ex) i = 24 '
		int i = 24;
		
		// 부호 연산자 +, -
		i = +1;
		i = -1;
		
		// 산술 연산자 : +, -, *, /, %
		i = 1+2; // 결과값 3
		System.out.println(i);
		i = 1-2; // 결과값 -1
		System.out.println(i);
		i = 10*2; // 결과값 20
		System.out.println(i);
		i = 10/2; // 결과값 5
		System.out.println(i);
		i = 10%3; // 결과값 1 : 10을3으로 나누며 3과 '나머지1' >> 1 (나머지가 나오기때문에 '나머지연산자' 라고도 한다.)
		System.out.println(i);
		
		// 증가 감소 연산자 : ++, --
		// ++를 변수의 앞에 붙였을 경우 먼저 +1 한 결과값이 출력, --를 
		// ++를 변수의 뒤에 붙였을 경우 결과값이 출력된 후 +1이 계산, --
		i = 0;
		System.out.println(i++); // i값을 출력후 +1함 >> 다음 연산시 i = i+1 > i = 0 이라서 0이 나옴
		System.out.println(i); //위의 연산식을 지났기 때문에 i = i+1 > 0 = 0+1 값이라서 1 이 나옴
		
		i = 200;
		int j = i++ +10;
		System.out.println(i); // i++ 을 출력>>201
		System.out.println(j); // j 는 ++의 우선순위가 후순위기 때문에 210이 나옴
		i = 200;
		int j1 = ++i +10; // ++i 는 i = i+1 과 같은 값이다
		System.out.println(j1); // j1 은 ++의 우선순위가 선순위기 때문에 211이 나옴
								// ++ 나 --는 연산식에 넣지 않고 개별로 사용해야 순서가 제대로 나옴
		i = 200;
		--i; // -- 개별사용
		int j2 = i + 10; // -1 된 값인 199+10
		System.out.println(j2); //결과값 199+10 = 209
		
		
		
		
		
	}

}
