package bridgelabz.com;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class VendingMachine {
   static int v[] = {1, 2, 5, 10, 50, 100, 500, 1000};
   static int i;
   static  int calcNotes = 0;
   static  int sum;
   static int totalNote=0;
    static int vendingMachine(int money,int v[]) {
        if (money == 0) {
            return -1;
        } else {
            for (i = v.length - 1; i >= 0; i--) {

                int rem = 0;
                if (money >= v[i]) {
                    rem = money % v[i];
                    calcNotes = money / v[i];
                    totalNote = totalNote + calcNotes;//0+1
                    money = rem;//570
                    System.out.println(v[i] + " with notes : " + calcNotes);

                }
            }
        }
        return vendingMachine(money,v);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int money = scan.nextInt();
        vendingMachine(money, v);
        System.out.println("Total notes used are : "+totalNote);
    }

}
