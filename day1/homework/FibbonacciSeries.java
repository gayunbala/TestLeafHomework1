package day1.homework;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int firNum=0;
		int secNum=1;
		int sum;
		System.out.println("The fibonacci Series for the given Range is :");
		
		for(int i=0;i<range;i++) {
			System.out.print(firNum+" ");
			sum=firNum+secNum;
			firNum=secNum;
			secNum=sum;
		}
	}

}
