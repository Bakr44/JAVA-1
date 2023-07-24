import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //5.Write a program that checks the role of the user

        System.out.println("please enter user role (admin, superuser, user):");
        String role = input.nextLine();

        if (role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        }else if(role.equalsIgnoreCase("superuser")){
            System.out.println("welcome superuser");
        }else if(role.equalsIgnoreCase("user")){
            System.out.println("welcome user");
        }else{
            System.out.println("invalid role");
        }
    }
}
