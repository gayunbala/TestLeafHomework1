package day6.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/radio.html");
	driver.manage().window().maximize();
	
	//Are you enjoying the classes?
	driver.findElementByXPath("//label[contains(text(),'enjoying')]/following::input[1]").click();
	System.out.println("The first radio button is clicked");
	Thread.sleep(3000);
	driver.findElementByXPath("//label[contains(text(),'enjoying')]/following::input[2]").click();
	System.out.println("The Second radio button is clicked");
	Thread.sleep(3000);
	//Find default selected radio button
	boolean radio1= driver.findElementByXPath("//label[contains(text(),'default')]/following::input[1]").isSelected();
	boolean radio2= driver.findElementByXPath("//label[contains(text(),'default')]/following::input[2]").isSelected();
	if (radio1==true) {
		
		System.out.println("The name of the radio button which is selected by defualt is: "+driver.findElementByXPath("//label[contains(text(),'default')]/following-sibling::label[1]").getAttribute("for"));
		
	}
	else if(radio2==true)
	{
		System.err.println("The name of the radio button which is selected by defualt is: "+driver.findElementByXPath("//label[contains(text(),'default')]/following-sibling::label[2]").getAttribute("for"));
	}
	//Select your age group (Only if choice wasn't selected)
	boolean ageRadio=driver.findElementByXPath("//label[contains(text(),'choice')]/following::input[1]").isSelected();
	if (ageRadio==false) {
		
		driver.findElementByXPath("//label[contains(text(),'choice')]/following::input[1]").click();
		Thread.sleep(3000);
	}
	else
	{
	System.out.println("The Desired Radio button for age is already Selected");
	}
		
	
	driver.close();
	//driver.quit();
}
}

