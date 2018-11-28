import java.util.*;
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
	
}
