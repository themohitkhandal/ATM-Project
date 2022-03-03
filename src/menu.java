import java.util.Scanner;

public class menu {
    public static Scanner scan = new Scanner(System.in);
    static int acc_no, acc_pin, func_choice, exit=1,first_choice;
    static int acc_bal = 10000;

    public static void check_login(){
        System.out.print("Enter Account No. : ");
        acc_no = scan.nextInt();
        System.out.print("Enter Account Pin : ");
        acc_pin = scan.nextInt();
        login.check_login();
    }
    public static void functions(){
        System.out.println("----------------------------");
        System.out.println("Option1 : Check Balance ");
        System.out.println("Option2 : Withdraw Amount ");
        System.out.println("Option3 : Deposit Amount ");
        System.out.println("Option4 : Exit");
        System.out.println("----------------------------");

        func_choice = scan.nextInt();
        if (func_choice == 1){
            functions.check_bal();
        }else if(func_choice == 2){
            functions.withdraw();
        }else if (func_choice == 3){
            functions.deposit();
        }else {
            System.exit(0);
        }
    }
}
