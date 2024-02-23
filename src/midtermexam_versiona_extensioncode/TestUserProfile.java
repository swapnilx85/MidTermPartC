/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter their name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Prompting the user to enter their favorite actor
        System.out.println("Enter your favorite actor:");
        String favoriteActor = scanner.nextLine();

       
        // Displaying message that userProfile was created
        System.out.println("Your userProfile was created.");
    }
}
    
