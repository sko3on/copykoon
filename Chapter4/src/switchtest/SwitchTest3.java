package switchtest;

import java.util.Scanner;

public class SwitchTest3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 5층 건물의 층수를 받아 어떤층인 알려주는 프로그램
		// 1층 : 약국, 2층 : 정형외과, 3층 : 피부과, 4층 : 치과, 5층 : 헬스클럽
		
		System.out.println("건물층수를 입력해주세요. >>");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();		
		String str  = "";
		
		switch(floor) // switch 문 사용
		{
			case 1:
				System.out.println(floor + "층은 약국입니다");
				break;
			case 2:
				System.out.println(floor + "층은 정형외과입니다");
				break;
			case 3:
				System.out.println(floor + "층은 피부과입니다");
				break;
			case 4:
				System.out.println(floor + "층은 치과입니다");
				break;
			case 5:
				System.out.println(floor + "층은 헬스클럽입니다");
				break;
			default :
				System.out.println(floor + "층은 존재하지않습니다.");
				break;
		}
		System.out.println("-------------------------------------------");
		switch(floor) // switch 문 안에 변수 str 사용
		{
		case 1:
			str = "약국입니다.";
			break;
		case 2:
			str = "정형외과입니다.";
			break;
		case 3:
			str = "피부과입니다.";
			break;
		case 4:
			str = "치과입니다.";
			break;
		case 5:
			str = "헬스클럽입니다";
			break;
		default :
			str = "존재하지않습니다.";
			break;
		}
		System.out.println(floor + "층은 " + str);
		System.out.println("-------------------------------------------");
		
		// if문 사용
		if(floor ==1) 
		{
			System.out.println(floor + "층은 약국입니다");
		}
		else if(floor ==2) 
		{
			System.out.println(floor + "층은 정형외과입니다");
		}
		else if(floor ==3) 
		{
			System.out.println(floor + "층은 피부과입니다");
		}
		else if(floor ==4) 
		{
			System.out.println(floor + "층은 치과입니다");
		}
		else if(floor ==5) 
		{
			System.out.println(floor + "층은 헬스클럽입니다");
		}
		else 
		{
			System.out.println(floor + "층은 존재하지않습니다.");
		}
		System.out.println("-------------------------------------------");
		
		// if 문에 변수 str 사용
		if(floor ==1)
		{
			str = "약국입니다.";
		}
		else if(floor ==2)
		{
			str = "정형외과입니다.";
		}
		else if(floor ==3)
		{
			str = "피부과입니다.";
		}
		else if(floor ==4)
		{
			str = "치과입니다.";
		}
		else if(floor ==5)
		{
			str = "헬스클럽입니다";
		}
		else
		{
			str = "존재하지않습니다.";
		}
		System.out.println(floor + "층은 " + str);
	}

}
