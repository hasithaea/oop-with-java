import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Basic Calculator");

        System.out.println("Enter function ( + | - | * | / ): ");
        String function= input.next();

        System.out.println("Enter number 1: ");
        double num1=input.nextDouble();

        System.out.println("Enter number 2: ");
        double num2=input.nextDouble();

        double total=0;

        if (function.equals("+")){
            total=num1+num2;
        }
        else if(function.equals("-")){
            total=num1-num2;
        }
        else if(function.equals("*")){
            total=num1*num2;
        }
        else if(function.equals("/")){
            total=num1/num2;
        }


        System.out.println("The answer is: "+total);
    }
}
