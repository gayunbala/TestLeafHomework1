package day5.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class EditLeadWithOpera {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		OperaDriver driver= new OperaDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("Demosalesmanager");
		driver.findElementByXPath("(//form[@id='login']//input)[2]").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		CreateLeadwithXpath co=new CreateLeadwithXpath();
		driver.findElementByXPath("//label[text()='Company Name:']/following ::input[18]").sendKeys(co.compName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    // Wrong//driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]").click();
	    //correct-->One method to find the first element-->From Parent to child
	    //driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	    //Another Method to click on the first element-->From Grand Parent to child
	    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);Thread.sleep(3000);   
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]").click();
       	driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		String oldCompName = driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").getAttribute("Value");
		System.out.println("The original Company Name is---> "+ oldCompName);
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").clear();
		String newCompName="CTS";
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").sendKeys(newCompName);
		driver.findElementByName("submitButton").click();
		String updatedCompName = driver.findElementByXPath("//span[text()='Company Name']/following::span[1]").getText();
		System.out.println(updatedCompName);
		String finalCompName=updatedCompName.replaceAll("[^a-zA-Z]", "");
		System.out.println("The Updated Company Name is---> "+finalCompName);
		if (newCompName.equalsIgnoreCase(finalCompName)) {
			System.out.println("The Edit Lead is Successful");
			
		}
		else
		{
			System.out.println("The Edit Lead is not Successful");
			
			
			
		}
		driver.close();

}
}
