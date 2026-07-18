class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void purr() {
        System.out.println("Purrrr");
    }
}

public class MainAnimal {
    public static void main (String [] args) {

        //dog
        Dog dog = new Dog();
        dog.name="Tommy";
        dog.age=5;

        System.out.println(dog.name + " is " + dog.age + " old");
        dog.eat();
        dog.bark();

        System.out.println();

        //cat
        Cat cat = new Cat();
        cat.name="Y. Puswardana";
        cat.age=1;

        System.out.println(cat.name + " is " + cat.age + " old");
        cat.eat();
        cat.purr();
    }
}