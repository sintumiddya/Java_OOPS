import java.util.Scanner;

class usre_input{
    String name;

    public static void main(String[]args){
        usre_input ui=new usre_input();
        Scanner sc=new Scanner(System.in);


        System.out.println("enter your name = ");

        ui.name=sc.nextLine();

        System.out.println("your name is ="+ui.name);
    }
}