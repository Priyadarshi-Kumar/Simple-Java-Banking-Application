/**
 * This code will show the working of bank
 */
package bank;
import java.util.Scanner;
/**
 * Declaring the balance,id and name of the person
 * string as name
 * integer type account no i.e.id
 * balance in this case is a integer we can make it to accept floating number or
 * double numbers
 * @author priyadarshi
 */
public class Bank {
static Scanner input = new Scanner(System.in);
public static int id, balance;
private static String name;
Bank(String name, int id, int balance) {
this.name = name;
this.id = id;
this.balance = balance;
}

    public Bank() {
        System.out.println("hello!");
    }

   
/**
 * This methods gives the information of a person in a particular bank holding 
 * an account 
 */
void display() {
System.out.println("Name:" + name);
System.out.println("Account id:" + id);
System.out.println("Balance:" + balance);
}
/**
 * Main gives the all possible choices for a costumer to choose
 * @param args initial declaration
 * Uses Scanner for user to input their choice
 */
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
/**
 * This program code work,s only for a single user 
 * and conatins no option for transfer
 */
