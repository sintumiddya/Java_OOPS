class pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write something....");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class This {
    public static void main(String args[]){
        pen pen1 = new pen();

        pen1.color="blue";
        pen1.type="Gel";

        //object 2
        pen pen2 = new pen();
        pen2.color="Black";
        pen2.type="Ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}