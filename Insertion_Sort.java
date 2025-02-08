package demo;

import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int a[]= {3,1,4,5,2};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j =i+1;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void swap(int a[],int index1,int index2)
	{
		int temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
	}
}
		
