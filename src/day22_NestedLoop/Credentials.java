package day22_NestedLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Credentials {
    /*
        user name: cyber
        password: tek123
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        int attempt = 1;

        while( !(u.equals("cyber") && p.equals("tek123")) ){

            if(attempt == 3){
                System.out.println("your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid user name or password, please re-enter");
            System.out.println("Enter your user name:");
            u = scan.next();

            System.out.println("Enter your password");
            p = scan.next();

            attempt +=1;

            }
        System.out.println("Logged in");
        }
    }
