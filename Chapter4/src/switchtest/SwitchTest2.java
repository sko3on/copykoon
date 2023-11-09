package switchtest;

import java.util.Scanner;

public class SwitchTest2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		switch(변수)
//		{
//			case 변수와 비교하고싶은 값 :	실행문;
//			break;
//			case 변수와 비교하고싶은 값 :	실행문;
//			break;
//			default : 실행문;
//			break;
//		}
		// 1, 3, 5, 7, 8, 10, 12월 = 31
		// 4, 6, 9, 11월 = 30
		// 2월 = 28
		System.out.println("월을 입력해주세요. >>");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int days = 0;
		switch(month) // case 사이에는 ,를 쓰는것이아닌 case a: case b: 이런식으로 연속해서 적는다. 간단한 비교를 여러개 하기 좋다.
		{
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: 
				days = 31;
				break;
			case 4: 
			case 6: 
			case 9: 
			case 11:
				days = 30;
				break;
			case 2 :
				days = 28;
				break;
			default :
				days = 0;
				break;
		}
		System.out.println(month + "월은 " + days + "일 입니다");
		System.out.println("해당 " + month + "월은 존재하지않는 월입니다.");
		
			
		if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12)
		{
			days = 31;
			System.out.println(month + "월은 " + days + "일 입니다");
		}
		else if(month ==4 || month ==9 || month ==9 || month ==11)
		{
			days = 30;
			System.out.println(month + "월은 " + days + "일 입니다");
		}
		else if(month ==2)
		{
			days = 28;
			System.out.println(month + "월은 " + days + "일 입니다");
		}
		else
		{
			days = 0;
		}
		if(days ==0)
		{
			System.out.println("해당 " + month + "월은 존재하지않는 월입니다.");
		}

	}

}
