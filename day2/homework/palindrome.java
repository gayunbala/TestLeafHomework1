package day2.homework;

public class palindrome {
	public static void main(String[] args) {
		String s1="Madam";
		int len =s1.length();
		String s1Rev="";
		//System.out.println("The lenghth of the String is :"+ len);
		for(int i=len-1;i>=0;i--)
		{
			s1Rev=s1Rev+s1.charAt(i);
			//System.out.println(s1Rev);
		}
		if(s1.equalsIgnoreCase(s1Rev))
		{
			System.out.println("The String is a palindrome");
			
		}
		
		else
		{
			System.out.println("The String is  not a palindrome");
			
		}
			
			
	}

}
