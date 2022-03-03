public class login{
    public static void check_login(){
        if (menu.acc_no == 123 && menu.acc_pin == 1234){
            System.out.println("Login Accepted");
            menu.functions();
        } else {
            System.out.println("Incorrect!");
        }
    }
}
