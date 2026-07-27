class Student {
    String name;
    int age;

    // method
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non peramiterized constructor
    Student() {
        System.out.println("this is the non peremiterized constructor");
    }

    // peremiterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class Constructor {

    public static void main(String args[]) {
        // non peramiterized constructor
        System.out.println("................................");
        Student s0 = new Student();
        // s0.name = "sintu middya";
        // s0.age = 24;
        // s0.printInfo();

        // peramiterized constructor
        Student s1 = new Student("sintu middya", 24);
        s1.printInfo();

        // copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();

    }
}