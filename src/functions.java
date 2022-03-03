import java.util.Scanner;

public class functions {
        public static Scanner scan = new Scanner(System.in);
        static int withdraw_amt, deposit_amt;
        public static void new_bal(){
            if (menu.func_choice == 2){
                System.out.println(menu.acc_bal = menu.acc_bal - withdraw_amt);
            } else if (menu.func_choice == 3){
                System.out.println(menu.acc_bal = menu.acc_bal + deposit_amt);
            }
        }
        public static void check_bal(){
            System.out.println("Current Balance : " + menu.acc_bal);
            menu.functions();
        }
        public static void withdraw(){
            System.out.print("Enter amount to withdraw: ");
            withdraw_amt = scan.nextInt();
            if (withdraw_amt > menu.acc_bal){
                System.out.println("Low Balance!");
            } else {
                System.out.println("Withdraw Successful");
            }
            System.out.print("Updated Balance : ");
            new_bal();
            menu.functions();
        }
        public static void deposit(){
            System.out.print("Enter amount to deposit: ");
            deposit_amt = scan.nextInt();
            System.out.print("Updated Balance : ");
            new_bal();
            menu.functions();
        }
}
