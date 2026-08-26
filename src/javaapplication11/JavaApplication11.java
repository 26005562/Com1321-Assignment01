/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author muren
 */
public class JavaApplication11 {

    public static void main(String[] args) {
        /**
     *Main method of the application.
     * It displays the welcome message and controls menu navigation.
     * @param args the command line arguments
     */
        // Scanner object used to collect user input
        Scanner input = new Scanner(System.in);
        // Display application heading
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        // Keep displaying the launch prompt until the application is closed
        while (true) {
        System.out.println("");
        System.out.print("Enter (1) to launch menu or any other key to exit : ");
        // Store the user's input
        String value = input.nextLine();
        System.out.println("");
        if("1".equals(value.trim())){ // Open the product menu if the user enters 1
            int choice = Products.DisplayMenu();// Get the selected menu option
            // Execute the selected menu option
            switch(choice){
                case 1: Products.CaptureProduct();
                    break;
                case 2: Products.SearchProduct();
                    break;
                case 3: Products.UpdateProduct();
                    break;
                case 4: Products.DeleteProduct();
                    break;
                case 5: Products.PrintProductReport();
                    break;
                case 6: Products.ExitApplication();
                    break;
            }
        }
        else{  
            Products.ExitApplication();// Exit the application if any key other than 1 is entered
        } 
            
        }
    
    }
    
}

    
    


    
    



    

    
        
    
    
    


    
    


    
    


    
    

