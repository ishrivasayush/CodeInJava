package BasicMaths;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(countDigits(n));
    }
    public static int countDigits(int num)
    {
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
