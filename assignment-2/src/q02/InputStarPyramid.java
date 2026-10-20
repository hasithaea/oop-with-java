package q02;

import java.util.Scanner;

public class InputStarPyramid {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int layers = scanner.nextInt();
        
        for (int i=0; i<layers; i++) {
            for (int j=layers; i<j; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        scanner.close();
    }
}
