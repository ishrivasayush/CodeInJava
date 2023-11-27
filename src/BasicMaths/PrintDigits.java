package BasicMaths;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        printDigits(n);
    }
    public static void printDigits(int num)
    {
        int lastDigit=0;
        while (num>0)
        {
            lastDigit=num%10;
            System.out.println(lastDigit);
            num=num/10;
        }
    }
}
