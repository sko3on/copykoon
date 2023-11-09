package fortest;

import java.util.Scanner;

public class Practice
{

	public static void main(String[] args) 
	{
		// 윤년 확인 프로그램
		// 윤년의 조건
		// 4로 나누어 떨어지는 연도는 윤년입니다
		// 100으로 나누어 떨어지는 연도는 윤년이 아닙니다.
		// 400으로 나누어 떨어지는 연도는 윤년입니다
		// 윤년일경우 : %4 == 0 || %400 == 0
		// 윤년이 아닐경우 : %100 == 0 && %400 !=0 || %4 !=0
		
		System.out.println("연도를 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%400 == 0 || (year%4 == 0 && year%100 !=0) ) 
		{
			System.out.println(year + "년은 윤년입니다.");
		}			
		else
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		System.out.println("------------------------------");
		if(year%400 == 0)
		{
			System.out.println(year + "년은 윤년입니다.");
		}
		else if(year%100 == 0)
		{
			System.out.println(year + "년은 윤년이 아닙니다.");	
		}
		else if(year%4 == 0)
		{
			System.out.println(year + "년은 윤년입니다.");
		}
		else
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
