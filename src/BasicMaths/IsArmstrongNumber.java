package BasicMaths;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        if (armStrongNumber(n))
        {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not a Armstrong");
        }
    }
    public static boolean armStrongNumber(int num)
    {
        int lastDigit=0;
        long sum=0;
        int temp=num;
        while (temp>0)
        {
            lastDigit=temp%10;
            long qube=(lastDigit*lastDigit*lastDigit);
            sum=sum+qube;
            temp=temp/10;
        }
        return sum==num;
    }
}
