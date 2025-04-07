//Leo Choi
//4/7/2025
import java.util.*;
public class AccountSetup{

public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    String username;
    String password;
        System.out.println("Enter a username");
        username = input.next();
        System.out.println("Enter a password 8 characters long ");
        password = input.next();
        
        int passlength = password.length();
        while(passlength < 8){
            System.out.println("Enter a password more than 8 characters long ");
            password = input.next();
        }
        if(passlength < 8){
            System.out.println("Your username is: " + username + "And you password is: " + password);
            password = input.next();
        }

}




}