package access;


public class Student
{
	// 접근 제어자 : public, private, protected, default
	public int studentID; // 다른 패키지에서 사용가능
	private String studentName; // 선언된 클래스 안에서만 사용가능
	int score; // default : 같은 패키지 안에서만 사용가능
	protected String majorCode; // 상속을 받거나 같은 패키지에 있을 경우 사용가능
	
	// getter AND setter : private 변수를 설정하고 받아오기 위한 메서드
	public String getStudentName()
	{
		return studentName;	//private 을 사용했기때문에 같은 클래스에서만 사용가능
	}
	public void setStudentName(String studentName)
	{
			this.studentName = studentName;		
	}
}
