package Algorithms.sorting;
import java.util.Scanner;

public class SelectionSort {
    /*
    procedure selectionSort( arr: List of elements, size: Number of elements in the list)
        set minIndex=-1
        for i from 0 to size-2
            set minIndex=i
                for j from i+1 to size-1
                    if arr[minIndex]>arr[j]
                        set minIndex=j
                    end if
                end for
                swap(i,minIndex)
       end for
    end procedure

    Time Complexity
    O(n^2)




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



        System.out.println();
        selectionSort(arr,size);

        System.out.println();
        System.out.println("After Sorting");
        for(int ar:arr)
        {
            System.out.print(ar+ " ");
        }


    }

    private static void selectionSort(int[] arr, int size) {
        int minIndex=-1;
        for (int i = 0; i < size-1 ; i++) {
            minIndex=i;
            for (int j = i+1; j <size; j++) {
                if (arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }

            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            for (int a:arr
                 ) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
