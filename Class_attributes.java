class Student {
    String name;
    int roll_number;
    String Address;
}

class Class_attributes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll_number = 26;
        s1.Address = "Kolkata";
        System.out.println(s1.name);

    }

}
