package Selenium.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends Base{
	public Searchhotel() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement sOption;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement sHotel;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement sRoom;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement sRoomNo1;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement sRoomNo2;
	
	
	public WebElement getsRoom() {
		return sRoom;
	}

	public WebElement getsRoomNo() {
		return sRoomNo1;
	}

	public WebElement getsOption() {
		
		return sOption;
		
	}

public WebElement getsHotel() {
		return sHotel;
	}

	
}
