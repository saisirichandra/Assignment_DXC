package Assignment;
/*
 *  find biggest number and smallest number in an array (Java)
 */
public class LargeSmall {
	public static void main(String[] args) {
		int arr[] = new int[]{1,12,31,21,4,5,34,76,69};
		int small = arr[0];
		int large= arr[0];

		for(int i=1; i< arr.length; i++)
		{
			if(arr[i] > large)
				large = arr[i];
			else if (arr[i] < small)
				small = arr[i];

		}
		System.out.println("Smallest Number in given array is : " + small);
		System.out.println("Largest Number in given array is : " + large); 
	}
}
