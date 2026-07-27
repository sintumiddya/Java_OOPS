// This is the multilavel inheritance ...............

class Shape{
    public void area(){
        System.out.println("Display Area ......");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((1.0/2)*l*h);
    }
}

class EqilateralTrangle extends Triangle{
    public void area(int l, int h){
        System.out.println((1.0/2)*l*h);
    }
}

public class MultiLevelInheritance {
    public static void main(String args[]){

        EqilateralTrangle eq1 = new EqilateralTrangle();
        eq1.area(10,5);
        eq1.area();

    }
}
