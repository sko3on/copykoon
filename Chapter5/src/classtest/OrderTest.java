package classtest;

//import java.util.Scanner;

class Order
{
	
	// 주문번호, 주문자 아이디, 주문 날짜, 주문자 이름, 주문 상품 번호, 배송주소
	// 기능 : 모든 내용을 출력하는 기능 (showOderInfo)
	// 주문번호 201803120001, abc123, 2018년 3월 12일, 홍길동, PD0345-12, 서울시 영등포구 여의도동 20
	// 멤버변수
	String orderNumber;
	String userID;
	String orderDate;
	String orderName;
	String goodID;
	String orderAddress;
	public Order(){} // 기본생성자 : 작성하지 않더라도 실행 가능. (프로그램이 생성될 때 컴퓨터가 생성해준다.
	// 생성자 : 인스턴스를 생성할 때 사용되는 메서드
	// 반드시 클래스 이름으로 만들어야하며 생성자를 작성하면 기본생성자는 없어지게됨
	
	// 여러개의 생성자 작성방법 (생성자 오버로드) #오버로드 중요#
	// 생성자의 매개변수의 갯수를 다르게한다.
	// 생성자의 매개변수 자료형을 다르게한다. (같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	public Order(String orderNumber, String userID, String orderDate,	String orderName, String goodID, String orderAddress)
	{
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.goodID = goodID;
		this.orderAddress = orderAddress;
		
	}
	
	void showOderInfo()
	{
//		System.out.println("주문번호을 입력하세요.>>");
//		Scanner sc = new Scanner(System.in);
//		String i = sc.next();
//		i = "orderNumber";
		System.out.println("주문번호 : "+ orderNumber);
		System.out.println("주문자 아이디 : "+ userID);
		System.out.println("주문 날짜 : "+ orderDate);
		System.out.println("주문자 이름 : "+ orderName);
		System.out.println("주문 상품 번호 : "+ goodID);
		System.out.println("배송 주소 : "+ orderAddress);
	}
	// 여러개의 메서드 작성방법 (메서드 오버로드) #오버로드 중요#
	// 메서드의 매개변수의 갯수를 다르게한다.
	// 메서드의 매개변수 자료형을 다르게한다. (같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	// 반환자료형 메서드명(매개변수)
	//	{ 
	//		실행문;
	//		return 반환값;
	//	}
	// void : 값을 반환하지 않을 때 사용
	int add(int x)
	{
		return x;
	}
	int add(int x, int y)
	{
		return x+y;
	}
	long add(long x, int y)
	{
		return x+y;
	}
	int add(int x, int y, int z)
	{
		return x+y+z;
	}
}
public class OrderTest 
{
	public static void main(String[] args) 
	{
		Order order1 = new Order();
		order1.orderNumber = "201803120001";
		order1.userID = "abc123";
		order1.orderDate = "2018년3월12일";
		order1.orderName ="홍길동";
		order1.goodID = "PD0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20";
		//ctrl + 메서드 이름 클릭 : 메서드가 선언되어있는 코드로 이동
		order1.showOderInfo();
		
		Order order2 = new Order("어", "def123", "2023년11월03일", "김김김", "PD0543-21", "부산시 부산진구 전포동");
		order2.showOderInfo();
		
		Order order3 = new Order("아니","d", "s", "sd", "sd", "sdds");
		order3.showOderInfo();
		
	}
}
