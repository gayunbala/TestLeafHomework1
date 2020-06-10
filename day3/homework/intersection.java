package day3.homework;

public class intersection {
public static void main(String[] args) {
	int[] a1= {3,2,11,4,6,7};
    int[] a2= {1,2,8,4,9,7};
    int[] a3= {};
int l1=a1.length;
int l2=a2.length;
for(int i=0;i<l1;i++)
{
	for (int j=0;j<l2;j++)
	{
		
	if(a1[i]==a2[j]) 
	{
		
		System.out.print(a2[j]+" ");
		//a3[i]=a1[i];
	}
	
}

}
}
}

