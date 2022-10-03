package bridgelabz.com;

import java.util.Scanner;

public class PerfectNumber {
    static void checkPerfectNo(int num){
        int sum =0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum==num){
            System.out.println(num+" is perfect number.");
        }
        else {
            System.out.println(num+" is not a perfect number.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to be checked : ");
        int num = scan.nextInt();
        checkPerfectNo(num);
    }
}
