package cooperation;

public class Taxi 
{
	public String taxis;
	public int passengerCount;
	public int money;
	
	public Taxi(String taxis)
	{
		this.taxis = taxis;
	}
	public void take(int money)
	{
		this.money += money; 
		passengerCount ++;
	}
	public void showInfo()
	{
		System.out.println(taxis + "택시의 승객은" + passengerCount + "명 이고, 수입은 " + money + "원입 니다.");
	}
}
