class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    double gpa;

    void study() {
        System.out.println("Studying...");
    }
}

public class MainGPA {
    public static void main (String [] args) {

        Student s1 = new Student();
        s1.name="Kasun";
        s1.age=21;
        s1.gpa=3.75;

        s1.displayInfo();
        s1.study();
    }
}