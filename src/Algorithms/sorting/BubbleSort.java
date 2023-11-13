package Algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {
    /*
procedure bubbleSort(arr: A list of elements, size: number of elements)
    for i from 0 to n-1
        for j from 0 to n-1-i
            if A[j] is bigger than the A[j+1] than
                swap(A[j],A[j+1);
            end if
        end for inner
   end for outer
end procedure

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
