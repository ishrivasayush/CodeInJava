package BasicMaths;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(reverseOfNumber(n));
    }
    public static int reverseOfNumber(int num)
    {
        int lastDigit=0;
        int revNum=0;
        while (num>0)
        {
            lastDigit=num%10;
            num=num/10;
            revNum=(revNum*10)+lastDigit;
        }
        return revNum;
    }
}
