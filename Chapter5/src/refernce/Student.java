package refernce;

class Subject
{
	int subjectNum;
	String subjectTitle;
	String teacherName;
	int Score;
}

public class Student 
{
	int studentID;
	String studentName;
	Subject korea; //참조 자료형
	Subject math;
	Subject en;
	Subject java;
	public Student(int studentID, String studentName ) //생성자 : 인스턴트를 만들 때 
	{
		this.studentID = studentID;
		this.studentName = studentName;
		korea = new Subject();
		math = new Subject();
		en = new Subject();
		java = new Subject();
	}
	
	public static void main(String[] args)
	{
		Student kim =  new Student(1001, "이순신");
		kim.korea.subjectTitle = "국어";
		kim.math.Score = 100;
		System.out.println(kim.korea.subjectTitle);
		
	}

	
}
