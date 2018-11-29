
public class SWEGit {

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
	 public static void MaxThreeNum(int arr[]){
     sort(arr);
    
     
     System.out.println("The first max num :"+arr[arr.length-1]);
     System.out.println("The first max num :"+arr[arr.length-2]);
     System.out.println("The first max num :"+arr[arr.length-3]);
     }
    


}

