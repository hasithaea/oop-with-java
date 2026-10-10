import java.util.Scanner;

public class AreaCal {
    public static void main (String args[]) {
        Scanner scanner =  new Scanner(System.in);
        float area=0;
        int choice=0;
        
        do {
            System.out.println("Select the number of shape you need");
            System.out.println("  1. Square\n  2. Circle\n  3. Rectangle\n  4. Cylinder");
            System.out.println("Enter 0 to exit the program");
            System.out.print(">");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("== Square ==");
                    System.out.print("Enter length: ");
                    float length = scanner.nextFloat();
                    area = length*length;
                    System.out.println("Area of square is " + area + "\n");
                    break;
                case 2:
                    System.out.println("== Circle ==");
                    System.out.print("Enter radius: ");
                    float radius = scanner.nextFloat();
                    area = (22.0f/7.0f)*radius*radius;
                    System.out.println("Area of circle is " + area + "\n");
                    break;
                case 3:
                    System.out.println("== Rectangle ==");
                    System.out.print("Enter side 1 length: ");
                    float side1 = scanner.nextFloat();
                    System.out.print("Enter side 2 length: ");
                    float side2 = scanner.nextFloat();
                    area = side1*side2;
                    System.out.println("Area of rectangle is " + area + "\n");
                    break;
                case 4:
                    System.out.println("== Cylinder ==");
                    System.out.print("Enter radius: ");
                    float cradius = scanner.nextFloat();                    
                    System.out.print("Enter height: ");
                    float height = scanner.nextFloat();
                    area = 2*(22.0f/7.0f)*cradius*height;
                    System.out.println("Area of cylinder is " + area + "\n");
                    break;
                default: 
                    if (choice!=0) {
                        System.out.println("Invalid!\nEnter a number between 0-4\n");
                    }
                    break;
            }
        }while (choice!=0);
        scanner.close();
    }  
}
