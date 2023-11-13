package Algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {
    /*
    Time Complexity - O(n^2)
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Size Of Array : ");
        int size= scanner.nextInt();
        int arr[]=new int[size];

        for (int i = 0; i <size ; i++) {
            System.out.println("Enter The Value Of Array :");
            arr[i]=scanner.nextInt();
        }


        System.out.println("Before Sorting");
        for(int ar:arr)
        {
            System.out.println(ar);
        }

        bubbleSort(arr,size);

        System.out.println("After Sorting");
        for(int ar:arr)
        {
            System.out.println(ar);
        }

    }
    public static void bubbleSort(int arr[],int size)
    {
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size-1-i ; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
