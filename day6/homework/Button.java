package day6.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) {
		//System.getProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("http://leafground.com/pages/Button.html");
        driver.manage().window().maximize();
        //Click button to travel home page
        driver.findElementByXPath("//label[contains(text(),'travel')]/following-sibling::button").click();
        driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
        //Find position of button (x,y)
       System.out.println("The X Axis location of the element is: "+driver.findElementByXPath("//button[text()='Get Position']").getLocation().getX());
       System.out.println("The Y Axis location of the element is: "+driver.findElementByXPath("//button[text()='Get Position']").getLocation().getY());
       System.out.println("The Location of the element is: "+driver.findElementByXPath("//button[text()='Get Position']").getLocation());
      // Find button color
       System.out.println("The colour of the specified Elmenet is : "+driver.findElementByXPath("//label[text()='Find button color']/following-sibling::button").getCssValue("background-color"));
       //Find the height and width
       System.out.println("The height of the given element is: "+driver.findElementByXPath("//button[text()='What is my size?']").getSize().height);
       System.out.println("The width of the given element is: "+driver.findElementByXPath("//button[text()='What is my size?']").getSize().getWidth());
       System.out.println("The size of the given element is: "+driver.findElementByXPath("//button[text()='What is my size?']").getSize());
       driver.close();
       System.out.println("The Button Page actions are completed Successfully!!!!!");
	}
	}


