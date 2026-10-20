package q04;

import java.util.Scanner;

public class TempMsg {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        double t=0;
        
        System.out.print("Enter Tempeature: ");
        t = scanner.nextDouble();
        
        if(30<t) {
            System.out.println("Hot");
        }
        else if(20<t) {
            System.out.println("Warm");
        }
        else if(10<t) {
            System.out.println("Fine");
        }
        else if(t<=10) {
            System.out.println("Cold");
        }
    }
}
