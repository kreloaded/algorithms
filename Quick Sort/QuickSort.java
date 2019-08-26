import java.util.*;

class Algorithm
{
	//sorting function
	public void quickSort(int arr[], int start, int end)
	{
		if(start < end)
		{
			int partitionIndex = partition(arr, start, end);
			quickSort(arr, start, partitionIndex-1);	//recursive call to perform two partioned halves
			quickSort(arr, partitionIndex+1, end);
		}
	}


	//partitioning and placing each pivot element at it's correct position
	public int partition(int arr[], int start, int end)
	{
		//here pivot is considered as the last element in array
		//for better performance it could be random element from array or
		//the middle element
		int pivot = arr[end];
		int partitionIndex = start;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				swap(arr,i,partitionIndex);
				partitionIndex++;
			}
		}
		
		swap(arr, partitionIndex, end);
		return partitionIndex;
	}

	//swapping values in array
	public void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//function for printing the array
	public void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

class QuickSort
{
	public static void main(String args[])
	{
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		int arr[] = {5,2,1,4,3};
		int n = arr.length;

		// for(int i=0;i<n;i++)
		// {
		// 	arr[i] = sc.nextInt();
		// }

		Algorithm al = new Algorithm();
		al.quickSort(arr,0,n-1);
		al.printArray(arr);
	}
}