// This is the Hirarchical Inheirtance .........


class Shape{
    public void area(){
        System.out.println("Display Area ......");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1.0/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println("The area of circle = "+(3.14)*r*r);
    }
}


public class HierarchicalInheritance {
    public static void main(String args[]){

        Triangle t1 =new Triangle();
        t1.area(20,5);
        t1.area();


        Circle c1 = new Circle();
        c1.area(50);
        c1.area();
    }
}
