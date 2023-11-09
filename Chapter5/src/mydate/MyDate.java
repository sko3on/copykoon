package mydate;

class MyDate 
{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String isValid() 
	{
		String str ="";
		if(month<1 && month>12)
		{
			str = "유효하지 않은 날짜입니다.";
		}
		else
		{	
			switch(month) 
			{
				case 1: case 3: case 5:	case 7:	case 8:	case 10: case 12: 
//					day = 31;
					if(day>31 && day<31)
					{
						str = "유효하지 않은 날짜입니다.";
					}
					else
					{
						str = "유효한 날짜입니다.";
					}
					break;
					
				case 4:	case 6:	case 9:	case 11:
//					day = 30;
					if(day>30 && day<30)
					{						
						str = "유효하지 않은 날짜입니다.";
					}
					else
					{
						str = "유효한 날짜입니다.";						
					}
					break;
				case 2 :
					if(day<=29)
					{
						if(year%400 == 0)
						{
							if(day<=29)
							{
								str = "유효한 날짜입니다.";
							}
			
						}
						else if(year%100 == 0)
						{
							if(day<=28)
							{
								str = "유효한 날짜입니다.";
							}
						}
						else if(year%4 == 0)
						{
							if(day<=29)
							{
								str = "유효한 날짜입니다.";
							}
						}
						else
						{
							if(day<=28)
							{
								str = "유효한 날짜입니다.";
							}
						}
					}
					else
					{
						str = "유효하지않은 날짜입니다.";
					}
					break;
				default :
					str = "유효하지않은 날짜입니다.";
					break;
			}
		}
		return str;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}

	
	
	
}