package bridgelabz.com;

import java.util.Scanner;

public class TemperatureConversion {
    static void temperaturConversion(int option ,int temperature){
       double result ;
        if (option==1){
             result=(temperature*9/5)+32;
            System.out.println(temperature+" Celsius to Fahrenheit : "+result);
        } else if (option==2) {
            result= (int) ((temperature-32)*5/9);
            System.out.println(temperature+" Fahrenheit to Celsius : "+result);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("If temperature is in Celsius press [1] ");
        System.out.println("If temperature is in Fahrenheit press [2] ");
        System.out.println("Enter your input : ");
        int option = scan.nextInt();
       if (option==1||option==2){
           System.out.println("Enter temperature Magnitude : ");
           int temperature = scan.nextInt();
           temperaturConversion(option,temperature);
       } else {
           System.out.println("You have entered invalid input. Please select between 1 or 2.");
       }

    }
}
