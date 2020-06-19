package day6.homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("http://leafground.com/pages/Link.html");
        driver.manage().window().maximize();
        
        //Go to Home Page
        
        driver.findElementByLinkText("Go to Home Page").click();
        
        //Find where am supposed to go without clicking me?
        
        driver.findElementByXPath("(//a[@class='wp-categories-link maxheight']/h5)[3]").click();
        String destination=driver.findElementByXPath("//a[contains(text(),'supposed')]").getAttribute("href");
        System.out.println("The System will redirect the link to this page: "+destination);
        //How many links are available in this page?
      
       List<WebElement> noOfLinks=driver.findElementsByTagName("a");
       System.out.println("The number of links in the page are: "+noOfLinks.size());
       for(int i=0;i<noOfLinks.size();i++)
       {
       WebElement ele=noOfLinks.get(i);
       ele.getText();
       System.out.println("The "+(i+1)+"th link in the page is: "+ele.getText());
        	
       }
       
          //Verify am I broken?
        
        driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
        String url=driver.getCurrentUrl();
        System.out.println("On Click of Verify am i broken link System is redirecting to: "+url); 
        if(url.contains("error"))
        {
        	System.out.println("The specified link is broken");
}
        else
        {
        	System.out.println("The specified link is broken");
        }
        
        
      //Go to Home Page (Interact with same link name)
        
        driver.get("http://leafground.com/pages/Link.html");
        
        driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
        
        System.out.println("It is redirecting to the Page: "+driver.getCurrentUrl());
        
        driver.findElementByXPath("//h5[text()='HyperLink']").click();
        
        String linkURL="http://leafground.com/pages/Link.html";
        if(driver.getCurrentUrl().equalsIgnoreCase(linkURL))
        {
        System.out.println("System is redirected back to the link page");
        }
        
       // driver.close();
	}

}
