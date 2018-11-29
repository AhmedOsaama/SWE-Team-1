/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public static void main(String[] args) {
              int Size;
         Scanner Read = new Scanner(System.in);
         System.out.print("Enter the Size of array : ");
        Size = Read.nextInt();
        int[] arr = new int[Size];
        for(int i=0 ;i<Size ; i++)
        {
            arr[i] = Read.nextInt();
        }
        System.out.println(Get_maidan(arr));
    }
    
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
        void printArray(int arr[])
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
    
}
