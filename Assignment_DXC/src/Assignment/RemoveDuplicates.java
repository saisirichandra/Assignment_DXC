package Assignment;

import java. util. Arrays;
/*
 * How to remove duplicate characters from String? 
 */
public class RemoveDuplicates {
	public static void printRepeating(int arr[], int size)
	{
		int i;
		int temp=0;
		System.out.println("Unique Elements are :");
		System.out.print(arr[0]+" ");
		for (i =1 ; i < size; i++)
		{
			if (arr[i-1] != arr[i]) {
				System.out.print(arr[i] + " ");
				temp = arr[i];
			}
			if(temp!=arr[size-1]&&i==size-1) 
				System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 5,1, 2, 3, 1, 4, 2, 4, 5};
		Arrays. sort(arr);
		printRepeating(arr, arr.length);
	}

}
