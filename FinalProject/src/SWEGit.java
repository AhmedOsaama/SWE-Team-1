package swegit;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class SWEGit {

    /**
     * @param args the command line arguments
     */

public static Boolean  CheckSorted (int[] arr)
     {
         Boolean descending=false , ascending=false;
     for (int i =0 ; i<(arr.length -1) ; i++)
     {
     if (arr[i] > arr[i+1])
     {ascending=false; break;}
     else ascending=true;

     }

     return (ascending||descending);
     }


	public static int[] ReverseArray(int[] arr)
	{
		int[] array = new int[arr.length]; //initializing an array of the same size of input array(arr).
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];		//assigns elements of the input array to the new array in a reversed manner.
		}
		
		return array;
	}
	
	public  static char[] ReverseArray(char[] arr) {
		char[] array = new char[arr.length];			//initializing an array of the same size of input array(arr).
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];			//assigns elements of the input array to the new array in a reversed manner.
		}
		return array;
		
	}
	
	
	//Methods to print the Reversed Array.

	
	public static void printArray(char[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	

        public static void sort(int arr[])

        {
            int len = arr.length;// length of the array
            for (int i = 0; i < len-1; i++)//for loop to chheck all elements in the array
                for (int j = 0; j < len-i-1; j++)//for loop to take the biggest number at the end of array and (len-i-1) to decrease size of non sorted array
                    if (arr[j] > arr[j+1])//to check doing swap to numbers or no
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
   /* Prints the array */
    public static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

    public static float Get_maidan(int[] arr) {
        float madian = 0;
        boolean flag =false;
        if(CheckSorted(arr) == true)
        {
            flag = true;
        }
        else
        {
            sort(arr);
            flag = true;
        }
        int index = 0;
        index = arr.length / 2;

	 
   

        if (arr.length % 2 == 0) {
            madian = (float) ((arr[index] + arr[index - 1]) / 2.0);
        }
        else
        {
            madian = arr[index];
        }

        return madian;
    }
  public static void MaxThreeNum(int arr[]){
     sort(arr);
    
     
     System.out.println("The first max num :"+arr[arr.length-1]);
     System.out.println("The first max num :"+arr[arr.length-2]);
     System.out.println("The first max num :"+arr[arr.length-3]);
     }

    public static int most_repeated_value(int array[])
	{
		int count = 0,temp = 0,ind = 0;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(array[j] == array[i])
					temp++;
			}
			if(temp > count)
			{
				count = temp;
				ind = i;
			}
			temp = 0;
		}
		return array[ind];
	}
	public static void main(String[] args)
	{


	}

}
