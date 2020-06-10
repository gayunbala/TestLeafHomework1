package day4.homework;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {3,2,11,4,6,7};
        Arrays.sort(arr);
        //System.out.println(arr);
        int l1=arr.length;
        System.out.println(l1);
        System.out.println("The Second largest element in this array is :"+arr[l1-2]);
        		
	}

}
