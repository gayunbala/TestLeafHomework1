package day5.homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DeleteLeadWithOpera {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[text()='Username']/following-sibling::input").sendKeys("Demosalesmanager");
		driver.findElementByXPath("(//form[@id='login']//input)[2]").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		CreateLeadwithXpath co=new CreateLeadwithXpath();
		driver.findElementByXPath("//label[contains(text(),'Email')]/following::input[1]").sendKeys(co.emailId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String leadId=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
          System.out.println(leadId);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
        driver.findElementByLinkText("Delete").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(leadId);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        String pageInfo=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
        String toVerify="No records to display";
        if (pageInfo.equalsIgnoreCase(toVerify)) {
        	
        	System.out.println("The Lead is deleted Succcessfully");
			
		}
        else
        {
        	System.out.println("The Lead is not deleted Properly");
        }
        driver.close();
        
        System.out.println("The Application is Closed successfully");
        
        }

}
