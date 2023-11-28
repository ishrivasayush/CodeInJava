package BasicMaths;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int count=0;
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0)
            {
                count++;
                if ((n%i)!=i)
                {
                    count++;
                }
            }
        }
        if (count==2)
        {
            System.out.println("Prime Number");
        }
    }
    public static boolean isPrime(int num)
    {
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
