package day1.homework;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num=13;
		int rem;
		int flag=0;
		for(int i=2;i<num;i++) 
		{
			rem=num%i;
			
			if (rem==0)
			{
				flag=flag+1;
			}
		
		
		}
		if (flag>0)
		{
			System.out.println("The number is a not prime number");
		}
		else
		{
			System.out.println("The number is a  prime number");
		}
		
	}
	}
	


