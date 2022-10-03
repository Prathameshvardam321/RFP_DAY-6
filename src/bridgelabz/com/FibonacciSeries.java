package bridgelabz.com;

import java.util.Scanner;

public class FibonacciSeries {
    static void fib(int n){
        int[] f=new int[n];
        f[0]=0;
        f[1]=1;
        System.out.print("0 1 ");
        for (int i=2;i<n;i++){
            f[i]=f[0]+f[1];
            System.out.print(f[i]+" ");
            f[0]=f[1];
            f[1]=f[i];

        }
        System.out.println();

    }
    static void fibonacci(int n){
        //for giving input number th element.
        int firstNum=0;
        int secondNum=1;
        int thirdNum=0;

        for (int i =2;i<n;i++) {
            thirdNum=firstNum+secondNum;

         firstNum=secondNum;
          secondNum=thirdNum;
        }
        System.out.println(n+"th element is "+thirdNum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number upto which fibonacci series want : ");
        int n = scan.nextInt();

         fib(n);
        fibonacci(n);
    }
}
