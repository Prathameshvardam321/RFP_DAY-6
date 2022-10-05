package bridgelabz.com;

import java.util.Scanner;

public class VendingMachine {
    static int totalNote=0;
    static void vendingMachine(int money) {
        int v[] = {1, 2, 5, 10, 50, 100, 500, 1000};
        int calcNotes = 0;
        for (int i = v.length - 1; i >= 0; i--) {
            int rem = 0;
            if (money >= v[i]) {
                rem = money % v[i];
                calcNotes = money / v[i];
                totalNote = totalNote + calcNotes;
                money = rem;
                System.out.println(v[i] + " with notes : " + calcNotes);

            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int money = scan.nextInt();
        vendingMachine(money);
        System.out.println("Total notes used are : "+totalNote);
    }
}
