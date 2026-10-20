package q01;

public class StarPattern03 {
    public static void main (String args[]) {
        int i,j;
        
        for (i=0; i<4; i++) {
            for (j=4; i<=j; j--) {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=0; i<2; i++) {
            for (j=0; j<4; j++) {
                System.out.print(" ");
            }
            System.out.println("* *");
        }
    }
}
