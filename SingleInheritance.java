class Shape {
    public void area() {
        System.out.println("Display area ......");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("The area of Triangle = " + (1.0 / 2 * l * h));
    }
}

public class SingleInheritance {
    public static void main(String args[]) {

        Triangle t1 = new Triangle();

        t1.area(10, 5);
        t1.area();
    }
}