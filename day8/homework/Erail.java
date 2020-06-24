package day8.homework;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	
	public static void main(String[] args) {
		//Set Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Object creation for Chromedriver
		ChromeDriver driver=new ChromeDriver();
		//loading the URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		//Click the 'sort on date' checkbox"
		driver.findElementByXPath("//label[text()='Sort on Date']").click();
		driver.findElementByXPath("//label[text()='Sort on Date']").click();
		//Clear and type in the from station text field
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("TBM",Keys.TAB);
		//Clear and type in the To station text field
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MV",Keys.ENTER);
		
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		
		//Wait Time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
		
		//Store all the train names in a list
		List<WebElement> list=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a");
		//Size of the list
		int listSize=list.size();
		System.out.println("The size of the list is: "+listSize);
		
		List<String> listTrainNames=new ArrayList<String>();
		
		for(WebElement ele:list)
		{
			listTrainNames.add(ele.getText());
			System.out.println(ele.getText());
		}
		//Size of the train name list
		System.out.println("The size of the train names list is: "+listTrainNames.size());
		System.out.println("The Elemnts in the list are: "+listTrainNames);
		//Declaring the Set and adding the list to the Set
		Set<String> setTrainNames=new LinkedHashSet<String>(listTrainNames);
		
		setTrainNames.addAll(listTrainNames);
		System.out.println("The size of the train names Set is: "+setTrainNames.size());
		System.out.println("The Elemnts in the Set are: "+setTrainNames);
		
		//To Verify the Size
		if(listTrainNames.size()==setTrainNames.size())
		{
			System.out.println("The Train names are Unique");
		}
		else
		{
			System.out.println("The Train names are not unique");
		}
		
		driver.close();
	}

}
