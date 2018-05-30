package bank;
import java.util.Scanner;

public class Bank {
        static Scanner input = new Scanner(System.in);
        private static int id, balance;
        private static String name;
        Bank(String name, int id, int balance) {
        Bank.name = name;
        Bank.id = id;
        Bank.balance = balance;
}
void display() {
        System.out.println("Name:" + name);
        System.out.println("Account id:" + id);
        System.out.println("Balance:" + balance);
}
public static void main(String args[]){
        System.out.println("Enter your name: ");
        String nam = input.nextLine();
        System.out.println("Please enter your account id: ");
        int i = input.nextInt();
        System.out.println("Enter initial balance: ");
        int bal = input.nextInt();
        Bank a1 = new Bank(nam, i, bal);
        int menu;
        System.out.println(" 1. Print balance");
        System.out.println(" 2. Deposit");
        System.out.println(" 3. Withdraw");
        System.out.println(" 4. Exit");
        boolean quit = false;
            do {
                System.out.print("Please enter your choice: ");
                menu = input.nextInt();
                switch(menu) {
                case 1:
                    a1.display();
                break;
                case 2:
                    System.out.println("enter amount to be deposited");
                      bal = input.nextInt();
                       balance+=bal;

            break;
            case 3:
                System.out.println("enter amount to be withdrawn");
                int w = input.nextInt();
                  balance-=w;
            break;
            case 4:
            quit = true;
            break;

            }
        }
    while(!quit);
    }
}
