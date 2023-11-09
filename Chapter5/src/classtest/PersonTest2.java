package classtest; // 이름 여러개 저장하기

import java.util.Scanner;

public class PersonTest2 
{

	public static void main(String[] args) 
	{
//		Person 클래스를 이용해서 new Person(); 이 실행되는순간, 인스턴스 생성
//		Person 클래스 :  설계도, 인스턴스 생성 : 객체
		
		Person kim = new Person(); // kim 을 인스턴스로 본다. 인스턴스 생성
		kim.name = "김유신";
		kim.height = 170;
		kim.weight = 70;
		kim.gender = 'M';
		kim.married = true;
		Person lee = new Person();
		lee.name = "이순신";
		Person anh = new Person();
		anh.name = "안연수";
		Person song = new Person();
		song.name = "송치원";
		
		kim.showPersonInfo();
		lee.showPersonInfo();
		anh.showPersonInfo();
		song.showPersonInfo();
		
		Person lim = new Person("임꺽정", 180, 80, 'M', true);
		lim.showPersonInfo();
		Person her = new Person("you", 180, 90, 'w', true);
		her.showPersonInfo();
		
		Scanner sc = new Scanner(System.in);
		
	}

}
