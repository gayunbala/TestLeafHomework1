package day3.homework;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String str="changeme";
		String strrev="";
		int len=str.length();
		char[] c=str.toCharArray();
		for(int i=0;i<=len-1;i++) {
			
			if(i%2!=0)
			{
				c[i]=Character.toUpperCase(c[i]);
			}
			else
			{
				c[i]=c[i];
			}
			System.out.print(c[i]+"");
		}
	}

}
