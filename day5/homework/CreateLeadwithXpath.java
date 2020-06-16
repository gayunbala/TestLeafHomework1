package day5.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadwithXpath {
	public  String compName="TCS";
	public  String emailId="ngayathri.1@gmail.com";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("Demosalesmanager");
		driver.findElementByXPath("(//form[@id='login']//input)[2]").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[contains(text(),'Create')]").click();
		CreateLeadwithXpath co=new CreateLeadwithXpath();
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").sendKeys(co.compName);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gayathri");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Balaji");
		WebElement source = driver.findElementByXPath("//select[@name='dataSourceId']");
		Select dd1=new Select(source);
		dd1.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//span[text()='Annual Revenue']/following::input[1]").sendKeys("10.5");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2=new Select(industry);
		dd2.selectByIndex(3);
		WebElement ownership = driver.findElementByXPath("//span[contains(text(),'Owner')]/following::select[1]");
		Select dd3=new Select(ownership);
		dd3.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		WebElement market = driver.findElementByXPath("//span[contains(text(),'Marketing')]/following::select[1]");
		Select dd4=new Select(market);
		dd4.selectByIndex(6);
		WebElement state = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select dd5=new Select(state);
		dd5.selectByValue("TX");
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys(co.emailId);
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("897686868686");
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	
		String leadNum=driver.findElementByXPath("//span[contains(text(),'Company')]/following::span[1]").getText();
		//String Lead=Leadnum.replaceAll("[0-9]", "");
		String lead=leadNum.replaceAll("[0-9]", "");
		//CreateLeadwithXpath co=new CreateLeadwithXpath();
	    co.compName=lead.replace("()", "");
		System.out.println("The newly created Lead is: "+leadNum);
		System.out.println("The newly created Lead number is: "+lead);
		System.out.println("The Company Name of the newly created lead is: "+co.compName);
		System.out.println("Create Lead Test case is a great Success yahooooooooo");
		driver.close();
		
	}

}
