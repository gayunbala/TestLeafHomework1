package day4.homework;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;)
		{
			if(arr[i]==(i+1))
			{
				//System.out.print(arr[i]+" ");
				i++;
			
			}
			else if(arr[i]!=(i+1))
			{
				System.out.print((i+1));
			break;
		}

	}

}
}
