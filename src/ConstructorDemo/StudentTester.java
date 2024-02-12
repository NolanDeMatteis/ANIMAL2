package ConstructorDemo;

public class StudentTester {
    public static void main(String[] args) {


        // Create a student using the no-argument constructor
        Student student1 = new Student();
        System.out.println("Student 1: Name=" + student1.getName() + ", Age=" + student1.getAge() + ", GPA=" + student1.getGpa());



        // Create a student with a name and age, but no GPA
        Student student2 = new Student("Alice", 20);
        System.out.println("Student 2: Name=" + student2.getName() + ", Age=" + student2.getAge() + ", GPA=" + student2.getGpa());



        // Create a student with a name, age, and GPA
        Student student3 = new Student("Bob", 21, 3.5);
        System.out.println("Student 3: Name=" + student3.getName() + ", Age=" + student3.getAge() + ", GPA=" + student3.getGpa());



        // Demonstrate the use of setters
        student1.setName("Charlie");
        student1.setAge(18);
        student1.setGpa(2.0);
        System.out.println("Student 1 after updates: Name=" + student1.getName() + ", Age=" + student1.getAge() + ", GPA=" + student1.getGpa());
    }
}
