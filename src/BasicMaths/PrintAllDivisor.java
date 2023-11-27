package BasicMaths;

import java.util.Scanner;

public class PrintAllDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n) {
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            {
                System.out.println(i);
            }
        }
    }

}
