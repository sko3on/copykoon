package fortest;

import java.util.Scanner;

public class RockPaper 
{

	public static void main(String[] args) 
	{
		// 가위바위보 게임 만들기
		// 가위 :1, 바위: 2, 보: 3
		// 3 - 2 > 1=패, 3-1> 2=승
		// 2- 3 > -1=승, 2-1> 1=패
		// 1 -2 > -1=승, 1-3>-2=패
		Scanner sc = new Scanner(System.in);
		System.out.println("가위:1, 바위:2, 보:3, 중에 하나를 선택해주세요.>>");
		int a = sc.nextInt();
		int com = (int)(Math.random() *3)+1;
		System.out.println("컴퓨터는 : " + com);
		int b = com - a;
		if(b == 0)
		{
			System.out.println(a + " 를 내서 비겼습니다");
		}
		else if(a>3)
		{
			System.out.println("잘못된 값 : " + a + "입니다.");
		}
		else if(b ==2 || b ==(-1))
		{
			System.out.println(a + " 를 내서 승리하셨습니다.");
		}
		else  if(b ==1 || b ==(-2))
		{
			System.out.println(a + " 를 내서 패배하셨습니다.");
		}
	}

}
