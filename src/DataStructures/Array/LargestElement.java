package DataStructures.Array;

import java.util.Scanner;

/*
Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.
 */
public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Size Of Array : ");
        int size= scanner.nextInt();
        int arr[]=new int[1000];

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter The Value Of Array :");
            arr[i]=scanner.nextInt();
        }

        for (int x:arr)
        {
            System.out.print(x+ " ");
        }

        System.out.println("Maximum Element : "+ largestElement(arr));


    }
    public static int largestElement(int arr[])
    {
        int size=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<size;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
