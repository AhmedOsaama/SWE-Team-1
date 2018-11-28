
public class SWEGit {

	public static void main (String[] args)
	{
		
	}
	public  int[] ReverseArray(int[] arr)
	{
		int[] array = new int[arr.length]; //initializing an array of the same size of input array(arr).
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];		//assigns elements of the input array to the new array in a reversed manner.
		}
		
		return array;
	}
	
	public char[] ReverseArray(char[] arr) {
		char[] array = new char[arr.length];			//initializing an array of the same size of input array(arr).
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];			//assigns elements of the input array to the new array in a reversed manner.
		}
		return array;
		
	}
	
	
	//Methods to print the Reversed Array.
	
	public void printArray(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
	public void printArray(char[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	
=======
	
	public static void main(String[] args)
	{
		
	}
=======
        public void sort(int arr[])
        {
            int len = arr.length;// length of the array
            for (int i = 0; i < len-1; i++)//for loop to chheck all elements in the array
                for (int j = 0; j < len-i-1; j++)//for loop to take the biggest number at the end of array and (len-i-1) to decrease size of non sorted array
                    if (arr[j] > arr[j+1])//to check doing swap to numbers or no
                    {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }

        /* Prints the array */
        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

}

