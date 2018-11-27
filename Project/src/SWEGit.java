import java.util.*;
public class SWEGit {
	public  int[] ReverseArray(int[] arr)
	{
		int[] array = new int[arr.length];
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];
		}
		
		return array;
	}
	
	public char[] ReverseArray(char[] arr) {
		char[] array = new char[arr.length];
		for (int i=arr.length-1; i>=0; i--)
		{
			array[(arr.length-1)-i] = arr[i];
		}
		return array;
		
	}
	
}
