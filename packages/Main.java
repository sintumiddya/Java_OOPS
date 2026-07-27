// This is the main class of the program

package packages;

import packages.bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "customer1";
        System.out.println(b1.name);
    }
}
