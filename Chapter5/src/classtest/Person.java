package classtest;

public class Person 
{
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼여부
	// 메모리에 새로 저장.
	// Person 생성자 작성하기
	// Person 가지고 있는 모든 변수의 데이터를 설정하는 생성자
	public Person() {}
	public Person(String name, int height, int weight, char gender, boolean married)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
		
	}
	
	void showPersonInfo()
	{
		System.out.println(add(10,20));
		System.out.println(name + ", " + height + ", " + weight + ", " + gender + ", " + married);		
	}
	// 반환자료형 메서드명(매개변수)
	//	{ 
	//		실행문;
	//		return 반환값;
	//	}
	// void : 값을 반환하지 않을 때 사용
	
	int add(int x, int y)
	{
		int result = x+y;
		return result;
	}
	
}
