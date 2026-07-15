class Car{
    String brand;
    String color;
}

public class Main{
    public static void main(String[] args){
        Car car1= new Car();

        car1.brand="Toyota";
        car1.color="Black";

        System.out.println("Brand:" + car1.brand);
        System.out.println("Color:" + car1.color);
    }
}