
class Animal {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name , int age){
        System.out.println(name+" "+age);
    }
}

public class Poloymorphism {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        a1.name = "sintu middya";
        a1.age = 24;

        a1.printInfo(a1.name+ " "+ a1.age);

    }
}
