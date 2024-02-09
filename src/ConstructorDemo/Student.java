package ConstructorDemo;

public class Student {
    private String name;
    private int age;
    public double gpa;






    /*
        vvvv OVERLOADING constructor example vvvv
     */

    // empty, default constructor
    public Student() {
        this.name = "UNDEFINED";
        this.age = -1;
        this.gpa = -1.0;
    }

    // 2 parameters, new student without a defined GPA
    public Student(String name, int age) {
        this(); // run the 'default' constructor, sets variables to our defaults

        this.name = name;
        this.age = age;
        //this.gpa = -1.0 this isn't needed since we called this();
    }

    // 3 parameters, sets all data at initialization
    public Student(String name, int age, double gpa) {
        this();

        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }







    /*
     *
     * GETTERS AND SETTERS -
     *  Concretely defines how our variables will be retrieved and modified
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
