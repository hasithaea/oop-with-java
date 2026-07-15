class Student {
    String name;
    Integer age;
    double gpa;
}

public class Main_student {
    public static void main (String[] args) {
        Student student1 =new Student();
        Student student2 =new Student();

        student1.name="Kasun";
        student1.age=21;
        student1.gpa=3.5;

        student2.name="Nimal";
        student2.age=22;
        student2.gpa=3.8;

        System.out.println("Student 1: ");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("GPA: " + student1.gpa);

        System.out.println("\n");

        System.out.println("Student 2: ");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("GPA: " + student2.gpa);
    }
}