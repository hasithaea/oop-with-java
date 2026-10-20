public class MultiplicationTable {
    public static void main (String args[]) {
        int i,j=0;
        
        System.out.print("* | ");
        
        for (i=1; i<=9; i++) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (i=1; i<=10; i++) {
            System.out.print("---");
        }
        System.out.println();
 
        for (i=1; i<=9; i++) {
            System.out.print(i+" | ");
            
            for (j=1; j<=9; j++) {
                if (i*j<10) {
                    System.out.print(i*j+ "  ");
                } else {
                    System.out.print(i*j+ " ");
                }
            }
            
            System.out.println();
        }
    }
}
