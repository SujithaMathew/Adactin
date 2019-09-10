package Selenium.Adactin;

public class ExecutableClass extends Base {
public static void main(String[] args) {
	LaunchBrowser("https://adactin.com/HotelApp/index.php");
	LoginLocator l=new LoginLocator();
	
	type(l.getTxtName(),"SujithaM");
	type(l.getTxtPass(),"Suji$adactin");
	click(l.getBtnLogin());
	
	Searchhotel s=new Searchhotel();
	HotelOption(s.getsOption(),1);
	HotelOption(s.getsHotel(),2);
	HotelOption(s.getsRoom(),1);
	HotelOption(s.getsRoomNo(),1);
	
}
}
