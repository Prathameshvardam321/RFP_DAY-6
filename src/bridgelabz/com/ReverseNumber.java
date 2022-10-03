package bridgelabz.com;

import java.util.Scanner;

public class ReverseNumber {
    static void reverseNumber(int num){
        int reverseNumber=0;
        while (num>0){
            int rem=num%10;
            reverseNumber=reverseNumber*10+rem;
            num/=10;
        }
        System.out.println("Reverse NUmber is : "+reverseNumber);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scan.nextInt();
        reverseNumber(num);
    }
}
