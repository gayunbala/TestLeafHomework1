package day2.homework;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	int count=0;
	String[] words=text.split("\\s");
	for(int i=0;i<=words.length-1;i++) {
		
	for(int j=i+1;j<=words.length-1;j++)
	{
		if(words[i].equalsIgnoreCase(words[j]))
		{
			count=count+1;
			
			if (count>1)
			{
				words[i]="";
			}
		}
	}
	
	System.out.print(words[i]+ " ");         
	}
	

  }  
}

