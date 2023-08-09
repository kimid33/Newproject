import java.util.*;
class MyEnum
{
	/*public static void main(String[] args) {
		System.out.println(Days.mon);  //internal->public static final Days mon
		System.out.println(Days.sun);
	}
}
                                    
enum Days
{
	mon,tue,wed,thu,fri,sat,sun
}*/

/*-----------------------------------------------------------------------------------------------*/
/*public static void main(String[] args) {
	Days s[] = Days.values();
	for(Days d:s)
		System.out.println(d+":"+d.ordinal());
}
}

enum Days
{
	mon,tue,wed,thu,fri,sat,sun;
}*/

public static void main(String[] args) {
	Days.wed.detail();
	System.out.println(Days.wed);
}
}
enum Days
{
	mon("monday","somwar"),
	tue("tuesday","mangal, "),
	wed("Wednesday","buddhwar");
	String value,info;
	Days(String val,String det)
	{
		value = val;
		info=det;
	}
	public void detail()
	{
		System.out.println(info);
	}
	public String toString()
	{
		return value+":"+info;
	}
}