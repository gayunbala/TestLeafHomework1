/*package day2.homework;
***************To Split a sentence into a string array of words********************
public class ReverseEvenString {
	public static void main(String[] args)
	{
		String s1="I am a software tester";
		String[] words=s1.split("\\s");
		
		for(String w:words){  
			System.out.println(w);  
			}  
		

}
}*/

package day2.homework;

public class ReverseEvenString {
	public static void main(String[] args)
	{
		String s1="I am a software tester";
		String[] words=s1.split("\\s");
		String rev="";
		 char[] c;
		for(int i=0;i<words.length;i++)
		{
			if (i%2!=0)
			{
			 //c=words[i].toCharArray();
			 for(int j=words[i].length()-1;j>=0;j--)
				{
					rev=rev+words[i].charAt(j);	
				}
			 System.out.print(rev+" ");
			
			}
			else
			{
			
			System.out.print(words[i]+" ");
		}
		
	}
}
}
