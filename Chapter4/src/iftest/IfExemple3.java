package iftest;

import java.util.Scanner;

public class IfExemple3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// ctrl + shift + o : 자동 임포트 단축키
		// 성적에 따라 학점 부여하기
		// 100~90점 : A
		// 89~80점 : B
		// 79~70점 : C
		// 69~60점 : D
		// 그외 : F
		System.out.print("점수를 입력해주세요. >> ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";
		
		// if문 만 사용(else if, else 미사용)
		if(score<=100 && score>=90)
		{
			grade = "A";
		}
		if(score<90 && score>=80)
		{
			grade = "B";
		}
		if(score<80 && score>=70)
		{
			grade = "C";
		}
		if(score<70 && score>=60)
		{
			grade = "D";
		}
		if(score<60)
		{
			grade = "F";
		}
		System.out.println(score == 70);
		System.out.println("학점은 " + grade + "입니다");
		if(grade.equals("F"))
		{
			System.out.println("열공이 필요합니다.");
		}
		String f  = new String("F");
		System.out.println(grade == "F"); // 문자열을 비교할때 == 은 가끔씩 오류가 나올수도있음
		System.out.println(grade.equals("F")); // String 을 비교할 때는 반드시 == 이 아닌 .equals() 를 써야한다. 
	}

}
