import java.util.*;

class MergeSortAlgorithm
{
	//method for dividing the given array recursively
	public void sort(int[] arr)
	{
		int n = arr.length;
		if(n<2)
		{
			return;
		}

		int mid = n/2;
		int left[] = new int[mid];
		int right[] = new int[n-mid];

		//storing array's left part in left array
		for(int i=0;i<mid;i++)
		{
			left[i]=arr[i];
		}

		//storing array's right part in right array
		for(int i=mid;i<n;i++)
		{
			right[i-mid]=arr[i];
		}

		//recursively dividing left as well as right array
		sort(left);
		sort(right);
		//merging left and right array to give merged sorted array
		Merge(left,right,arr);
	}

	//function for merging two arrays into one array
	//i.e merging left and right into arr
	public void Merge(int[] left, int[] right, int[] arr)
	{
		int n1 = left.length;
		int n2 = right.length;

		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}

		//merging remaining elements from left array
		if(i<n1)
		{
			while(i<n1)
			{
				arr[k]=left[i];
				i++;
				k++;
			}
		}

		//merging remaining elements from right array
		if(j<n2)
		{
			while(j<n2)
			{
				arr[k]=right[j];
				j++;
				k++;
			}
		}
	}

	//function for printing array
	public void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

class MergeSort
{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		int arr[] = {5,4,2,1,3};

		// for(int i=0;i<arr.length;i++)
		// {
		// 	arr[i]=sc.nextInt();
		// }

		MergeSortAlgorithm ms = new MergeSortAlgorithm();
		//called a function for recursive division
		ms.sort(arr);
		//printing the solution array
		ms.printArray(arr);
	}
}