 
 
package com.mycompany.task;
import java.util.Scanner;
public class Task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user, pass;
        
        System.out.println("Enter your username: ");
        user = input.nextLine();
        
        System.out.println("Enter your password: ");
        pass = input.nextLine();
        
        if(user.equals("khod") && (pass.equals("Jedi"))){
            System.out.println("MY BOSS WELCOME .");
        }else{
            System.out.println("These are not the droids you are looking for.");
        }
    }
    
}
