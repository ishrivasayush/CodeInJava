package Algorithms;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println(gcd(20,15));
//        int n=Math.min(num1,num2);
//        for (int i = n; i >=1; i--) {
//            if(num1%i==0 && num2%i==0) {
//                System.out.println(i);
//                break;
//            }
//        }
    }
    public static int gcd(int num1,int num2)
    {
        int n=Math.min(num1,num2);
        int gcd=1;
        for (int i =1; i <n ; i++) {
            if(num1%i==0 && num2%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
}
