package day2.homework;

public class PalindromeStringAnotherMethod {
	public static void main(String[] args) {
		String s="Madamm";
		String rev="";
		char[] c=s.toCharArray();//==>char[] c={'M','a','d','a','m'}
		
		for (int i=s.length()-1;i>=0;i--)
		
		{
			rev=rev+c[i];
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("The String is a palindrome");
			
		}
		
		else
		{
			System.err.println("The String is  not a palindrome");//if it is err then it will display the output in red
			
		}
	}

}
