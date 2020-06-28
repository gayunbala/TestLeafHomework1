package day9.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {


	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElementByXPath("//h5[text()='Table']").click();
	    // Table is identified 
	    WebElement table = driver.findElementById("table_id");
	    
	    //From table travel through rows
	    List<WebElement> allRows=table.findElements(By.tagName("tr"));
	    System.out.println("Number of rows in the table: "+allRows.size());
	    
	    //To find the Number of Columns(each column to row)
	    List<WebElement> allCols1=(allRows.get(1)).findElements(By.tagName("td"));
	    System.out.println("Number of Columns in the table: "+allCols1.size());
	    
	    //To get the Progress for the Learn to Interact with Elements
	    List<String> strList=new ArrayList<String>();
	    List<Integer> numList=new ArrayList<Integer>();
	    int lowProgress=0;
	    for(int i=1;i<allRows.size();i++)
	    {
	    WebElement eachRow=allRows.get(i);
	    List<WebElement> allCols=eachRow.findElements(By.tagName("td"));
	    strList.add(allCols.get(1).getText().replace("%",""));
	    numList.add(Integer.parseInt(allCols.get(1).getText().replace("%","")));
	    Collections.sort(numList);
	    lowProgress=numList.get(0);
	     
	    for(int j=0;j<allCols.size();j++)
	    {
	    if(allCols.get(j).getText().contains("Elements"))
	    		{
	    	System.out.println("The Progress for the Interact with Elements is: "+allCols.get(j+1).getText());
	    }
	   
	    }
	   
	    }
	    System.out.println("The String List is: "+strList);
	    System.out.println("The Converted  and sorted Number List is: "+numList);
	 
	    //To Check the Vital Task for the low progress
	    for(int i=1;i<allRows.size();i++)
	    {
	    WebElement eachRow=allRows.get(i);
	    List<WebElement> allCols=eachRow.findElements(By.tagName("td"));
	    lowProgress=numList.get(0);
	
	  
	  if ((Integer.parseInt(allCols.get(1).getText().replace("%",""))==lowProgress))
		 {
		   	WebElement ele=allCols.get(2);
		   	ele.click();
		   	System.out.println("The Vital Task of lowest Progress is clicked Successfully");
		 }
	    

	}
      driver.close();
}
}
