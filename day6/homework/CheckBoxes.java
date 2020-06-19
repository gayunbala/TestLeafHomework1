package day6.homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		driver.findElementByXPath("//label[contains(text(),'languages')]/following::input[3]").click();
		Thread.sleep(3000);
		//Confirm Selenium is checked
		boolean isChecked=driver.findElementByXPath("//label[contains(text(),'Confirm')]/following::input[1]").isSelected();
		
		if (isChecked==true) {
			
			System.out.println("The Selenium Checkbox is Selected");
			
		}
		//DeSelect only checked
		
		boolean check1=driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following::input[1]").isSelected();
		boolean check2=driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following::input[2]").isSelected();
		if (check1==true) {
			
			driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following::input[1]").click();
			
		}
		else if(check2==true)
		{
			driver.findElementByXPath("//label[contains(text(),'DeSelect')]/following::input[2]").click();
		}
		
	//Select all below checkboxes
		
		List<WebElement> checkBoxes = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
		System.out.println("The total number of checkboxes are: "+checkBoxes.size());
		int number=0;
		for(int i=0;i<checkBoxes.size();i++)
		{
		WebElement ele = checkBoxes.get(i);
		ele.click();
		if(ele.isSelected()==true)
		{
		number=number+1;
		}
		
	}
		if(number==checkBoxes.size())
		{
			System.out.println("All the checkboxes are  selected properly");
		}

}
}
	
