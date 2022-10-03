package bridgelabz.com;
import java.util.Scanner;
public class PrimeNummber {
    static void checkPrime(int num){
        int i=2;
        int count=0;
      while ( i <num){
          if (num%i==0){
              count = 1;
              break;
          }
         i++;
        }
      if (count==0){
          System.out.println(num+" is a prime number");
      }
      else {
          System.out.println(num+" is not a prime number.");
      }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to check : ");
        int x = scan.nextInt();
        checkPrime(x);
    }
}
