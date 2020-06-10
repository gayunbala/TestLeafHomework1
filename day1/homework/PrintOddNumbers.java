package day1.homework;

public class PrintOddNumbers {
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int arraySize=array.length;
		int odd;
		for(int i=0;i<arraySize;i++)
		{
		odd=array[i]%2;
		if(odd!=0) {
			System.out.println(array[i]);
		}
		}
	}

}
