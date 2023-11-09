package cooperation;

public class TakeTrans 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Edward 학생추가, 택시탑승, 소지금 15000
		// 택시요금 1만원
		Student james = new Student("Jamse", 5000);
		Student tomas = new Student("Tomas", 10000);
		Student edward = new Student("Edward", 15000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiname= new Taxi("카카오");
		edward.takeTaxi(taxiname);
		edward.showInfo();
		taxiname.showInfo();
		
	}

}
