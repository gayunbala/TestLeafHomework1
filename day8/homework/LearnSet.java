package day8.homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
	
	public static void main(String[] args) {
		
		String S1="PayPal India";
		char[] c1=S1.toCharArray();
		//Declare the empty charset
		Set<Character> charSet =new LinkedHashSet<Character>();
		//Declare the Duplicte Charset
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for(int i=0;i<c1.length;i++)
		
		{
			boolean flag=charSet.add(c1[i]);
			
			if(flag==false)
			{
				dupCharSet.add(c1[i]);
			}
		}
		System.out.println("The elemensts in the original Set is: "+charSet);
		System.out.println("The elemensts in the duplicate Set is: "+dupCharSet);
		//To reomove the elements in the charset which is already present in the dupchar
		charSet.removeAll(dupCharSet);
		System.out.println("Now the elements in the oringinal Charset is:"+charSet);
		System.out.println("The individual elements in the character Set is:");
		for(char eachchar:charSet)
		{
			if(eachchar==' ')
			{
				//continue;
			}
			else
			{
			System.out.println(eachchar);
		}
		
		
	}

}
}
