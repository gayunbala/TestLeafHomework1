package day1.homework;

public class SumOfDigitsOfAGivenNumber {

	public static void main(String[] args) {
		
		int number=12345;
		int sum=0;
		int i;
		
				
		while(number>0)
		{
			i=number%10;
			//System.out.println("The remainder is: "+i);
			sum=sum+i;
			//System.out.println("Now the value of sum is: "+sum);
			number=number/10;
			//System.out.println("Now the value of number is: "+number);
		}
		System.out.println("The sum of Digits is: "+sum);
	}
	
}


/*public class SumOfDigitsOfAGivenNumber {
	
	int number=12345;
	int sum=0;
	int i;
	

	public static void main(String[] args) {
		
		SumOfDigitsOfAGivenNumber obj=new SumOfDigitsOfAGivenNumber();
				
		while(obj.number>0)
		{
			obj.i=obj.number%10;
			//System.out.println("The remainder is: "+i);
			obj.sum=obj.sum+obj.i;
			//System.out.println("Now the value of sum is: "+sum);
			obj.number=obj.number/10;
			//System.out.println("Now the value of number is: "+number);
		}
		System.out.println("The sum of Digits is: "+obj.sum);
	}
	
}
*/