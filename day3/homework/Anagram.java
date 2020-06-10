package day3.homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		int len1=text1.length();
		int len2=text2.length();
		if(len1==len2) 
		{
			System.out.println("loop");
			char[] c1=text1.toCharArray();
			char[] c2=text2.toCharArray();
			Arrays.sort(c1);
			System.out.println(c1);
			Arrays.sort(c2);
			System.out.println(c2);
			//if(c1.equals(c2)) //if(c1==c2)  Both Are same
			if(Arrays.equals(c1,c2))
			{
				System.out.println("The Given Words Are An ANAGRAM===>>>Success");
		    }
	       }
		else
		{
			System.out.println("The Given Words Are Not An ANAGRAM");
		}
}
}
