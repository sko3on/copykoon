package test;


import java.util.Scanner;

public class TestNum8 
{

	public static void main(String[] args) 
	{
		System.out.print("커피 주문하세요.>>");
		Scanner sc = new Scanner(System.in);
		String coffee = sc.next();
		int num = sc.nextInt();
		System.out.println(coffee +" " + num);
		
		int cost = 0;
		
		//스위치문 사용시
		switch(coffee)
		{
		 case "에스프레소":
			 cost = 2000;
			 break;
		 case "아메리카노":
			 cost = 2500;
			 break;
		 case "카푸치노":
			 cost = 3000;
			 break;
		 case "카페라떼":
			 cost = 3500;
			 break;
		}
		System.out.println(num * cost + "원입니다.");
		
		//if문 사용시
		if(coffee.equals("에스프레소"))
		{
			cost = num*2000;
		}
		else if(coffee.equals("아메리카노"))
		{
			cost = num*2500;
		}
		else if(coffee.equals("카푸치노"))
		{
			cost = num*3000;
		}
		else if(coffee.equals("카페라떼"))
		{
			cost = num*3500;
		}
		System.out.println(cost + "원입니다.");
	}

}
