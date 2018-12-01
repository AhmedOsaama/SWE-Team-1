/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swgit;

import java.util.Scanner;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class SWEGit {

    public static void main(String[] args) {
        int Size;// size of the array 
        int choose;// have the choose of user for the function
        int choose2; //choice of whether to input char or int;
        Scanner Read = new Scanner(System.in);
        Scanner Read2 = new Scanner(System.in);

        System.out.println("1 to enter characters,0 to enter integers");
        choose2 = Read2.nextInt();
        if (choose2 == 1) {
            System.out.print("Enter the Size of array : ");
            Size = Read.nextInt();

            char[] arr = new char[Size];
            System.out.println("Fill the array: ");
            for (int i = 0; i < Size; i++)// take the numbers of array from the user
            {
                arr[i] = Read.next().charAt(0);
            }

            String[] funcs = {"Check palindrome", "Reverse array", "Shift array","All", "Exit"};
            System.out.println("You can choose the fuction you want to run :)");
            boolean exit = true;
            while (exit == true) {

                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + " - " + funcs[i]);
                }
                choose = Read.nextInt();

                switch (choose) {
                    case 1:
                        Checkpalindrome();
                        break;
                    case 2:
                        char[] rev = ReverseArray(arr);
                        printReverseArray(rev);
                        break;
                    case 3:
                        Shiftarray();
                        break;
                    case 4:
			Checkpalindrome();
			char[] rev = ReverseArray(arr);
                        printReverseArray(rev);
			Shiftarray();
			break;
                    case 5:
		    	exit = false;
                        break;
                }
            }
        } else {

            System.out.print("Enter the Size of array : ");

            Size = Read.nextInt();
            int[] arr = new int[Size];
            System.out.println("Fill the array: ");
            for (int i = 0; i < Size; i++)// take the numbers of array from the user
            {
                arr[i] = Read.nextInt();
            }

            String[] funcs = {"Most repeated value", "Sort", "Shuffle", "Find the largest prime", "Find the smallest prime", "Check palindrome",
                "Check sorted", "Count primes", "Reverse array", "Shift array", "Distinct array", "Get the maximum 3 numbers", "Get the minimum 3 numbers",
                "Get average", "Get median", "Return only primes", "Zero if less than zero","All", "Exit"};

            System.out.println("You can choose the function you want to run :)");

            Boolean exit = true;
            while (exit == true) {

                for (int i = 0; i < 18; i++) {
                    System.out.println(i + 1 + " - " + funcs[i]);
                }
                choose = Read.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("The Most Repeated value is ( " + most_repeated_value(arr) + " )");
                        break;
                    case 2:
                        sort(arr);
                        printArray(arr);
                        break;
                    case 3:
                        int[] newarr = new int[arr.length];
                        newarr=Shuffle(arr);
                        for (int i = 0; i < newarr.length; i++) {
                            System.out.println(newarr[i]);
                        }
                        break;
                    case 4:
                        Largestprime(arr);
                        break;
                    case 5:
                        System.out.println("The Smallest Prime Number is: " + Smallestprime(arr));
                        break;
                    case 6:
                        Checkpalindrome();
                        break;
                    case 7:
                        CheckSorted(arr);
                        break;
                    case 8:
                        Countprimes(arr);
                        break;
                    case 9:
                        int[] rev = ReverseArray(arr);
                        printReverseArray(rev);
                        break;
                    case 10:
                        Shiftarray();
                        break;
                    case 11:
                        Distinctarray(arr);
                        break;
                    case 12:
                        Getmaxnum(arr);
                        break;
                    case 13:
                        Getminnum(arr);
                        break;
                    case 14:
                        System.out.println("The Average of the array is " + GetAvg(arr));
                        break;
                    case 15:
                        System.out.println(" The maidian of the Array is ( " + Get_maidan(arr) + " )");
                        break;
                    case 16:
                        onlyprimes(arr);
                        break;
                    case 17:
                        ziflessz(arr);
                        break;
                    case 18:
			System.out.println("The Most Repeated value is ( " + most_repeated_value(arr) + " )");
			sort(arr);
                        printArray(arr);
			int[] newarr = new int[arr.length];
                        newarr=Shuffle(arr);
                        for (int i = 0; i < newarr.length; i++) {
                            System.out.println(newarr[i]);
                        }
			Largestprime(arr);
			System.out.println("The Smallest Prime Number is: " + Smallestprime(arr));
			Checkpalindrome();
			CheckSorted(arr);
			Countprimes(arr);
			int[] rev = ReverseArray(arr);
                        printReverseArray(rev);
			Shiftarray();
			Distinctarray(arr);
			Getmaxnum(arr);
			Getminnum(arr);
			System.out.println("The Average of the array is " + GetAvg(arr));
			System.out.println(" The maidian of the Array is ( " + Get_maidan(arr) + " )");
			onlyprimes(arr);
			ziflessz(arr);
			break;
		    case 19:
                        exit = false;
                        break;

                }
            }
        }
    }

    // Function of Most Repeated value 
    public static int most_repeated_value(int array[]) {
        int count = 0, temp = 0, ind = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    temp++;
                }
            }
            if (temp > count) {
                count = temp;
                ind = i;
            }
            temp = 0;
        }
        return array[ind];
    }

    //Function of Sorting the Array
    public static int[] sort(int arr[]) {
        int len = arr.length;// length of the array
        for (int i = 0; i < len - 1; i++)//for loop to check all elements in the array
        {
            for (int j = 0; j < len - i - 1; j++)//for loop to take the biggest number at the end of array and (len-i-1) to decrease size of non sorted array
            {
                if (arr[j] > arr[j + 1])//to check doing swap to numbers or no
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Function of the Shuffle the values
    public static int[] Shuffle(int array[]) {
        int[] temp = new int[array.length];
        Vector<Integer> nums = new Vector();

        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            int n = rand.nextInt(50) % array.length;
            int check = nums.indexOf(n);
            if (check == -1) {
                nums.add(n);
                temp[i] = array[n];
            } else {
                i--;
            }
        }
        return temp;
    }

    //  Function of Find the largest prime
    public static int Largestprime(int array[]) {
        int Larprime = 0;
        // code of of Find the Largest prime number in the array

        return Larprime;
    }

    // Function of Find the smallest prime number in the array
    public static int Smallestprime(int array[]) {
        int number = 0, reminder = 0, counter = 0;
        Vector<Integer> temp = new Vector();
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            for (int j = 1; j <= number; j++) {
                reminder = number % j;
                if (reminder == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                counter = 0;
                temp.add(number);
            } else {

                counter = 0;
            }
        }
        Collections.sort(temp);
        if (temp.size() != 0) {
            return temp.elementAt(0);
        }

        return -1;
    }

    // Function of Check palindrome
    public static Boolean Checkpalindrome() {
        Boolean palend = false;
        // code of Function of Check palindrome
        return palend;

    }

    // Function of Check sorted
    public static Boolean CheckSorted(int[] arr) {
        Boolean descending = false, ascending = false;
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            } else {
                ascending = true;
            }

        }

        return (ascending || descending);
    }
    // Function of Count primes

    public static int[] Countprimes(int[] array) {
        // code of Function of Count primes
        return array;
    }

    // Function of the Reverse array
    public static char[] ReverseArray(char[] arr) {

        char[] array = new char[arr.length];			//initializing an array of the same size of input array(arr).
        for (int i = arr.length - 1; i >= 0; i--) {
            array[(arr.length - 1) - i] = arr[i];			//assigns elements of the input array to the new array in a reversed manner.
        }
        return array;

    }

    public static int[] ReverseArray(int[] arr) {

        int[] array = new int[arr.length];			//initializing an array of the same size of input array(arr).
        for (int i = arr.length - 1; i >= 0; i--) {
            array[(arr.length - 1) - i] = arr[i];			//assigns elements of the input array to the new array in a reversed manner.
        }
        return array;

    }

    //Methods to print the Reversed Array.
    public static void printReverseArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void printReverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    //Function of Shift array
    public static void Shiftarray() {
        // code of function Shift array
    }

    // Function of Distinct array
    public static void Distinctarray(int[] array) {
        //code of function Distinct array
    }

    // Function of Get the Minimum 3 numbers
    public static void Getminnum(int[] array) {
        // code of function Get the Minimum 3 numbers
        sort(array); // sort the array to get the Minimum 3 elements
        System.out.println("The first min num :" + array[0]); // print the first min element of the array
        System.out.println("The second min num :" + array[1]); // print the second min element of the array
        System.out.println("The third min num :" + array[2]); // print the third min element of the array
    }

    // Function of Get the Minimum 3 numbers
    public static void Getmaxnum(int[] arr) {
        sort(arr);

        System.out.println("The first max number :" + arr[arr.length - 1]);
        System.out.println("The second max number :" + arr[arr.length - 2]);
        System.out.println("The third max number :" + arr[arr.length - 3]);

        // code of function Get the Minimum 3 numbers
    }

    //Function To Get average of an Array
    public static int GetAvg(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    //Function of Get Median
    public static float Get_maidan(int[] arr) {
        float madian = 0;
        boolean flag = false;
        if (CheckSorted(arr) == true) {
            flag = true;
        } else {
            sort(arr);
            flag = true;
        }
        int index = 0;
        index = arr.length / 2;

        if (arr.length % 2 == 0) {
            madian = (float) ((arr[index] + arr[index - 1]) / 2.0);
        } else {
            madian = arr[index];
        }

        return madian;
    }

    // Function of Return only primes
    public static void onlyprimes(int[] array) {
        // code of Function of Return only primes
    }

    //Function of setting Zero if less than zero
    public static int[] ziflessz(int[] array) {
        // code of Function of Zero if less than zero
        return array;
    }

    /* Prints the array */
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
