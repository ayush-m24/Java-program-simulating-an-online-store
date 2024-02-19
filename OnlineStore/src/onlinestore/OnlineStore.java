/**
  This java program simulates an online store where the user is given options to choose from and it calculates their total when the user 
  prompts the program to exit.
  
 */

package onlinestore;

/**
 * @author ayush.m
 * Student Id: 21495245
 */

//ArrayList package and Scanner package imported.
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    //A method called "product()" is defined, which will be called further in the code to print out the following print statements.
    static void product() {
    
    System.out.println("\nPlease select your desired product:");
    System.out.println("1. NotApple iPhone 13");
    System.out.println("2. NotApple iPhone 13 pro");
    System.out.println("3. NotApple iPhone 13 pro max");
    System.out.println("4. NotApple airpod pro");
    System.out.println("0. To exit buying products and proceed to checkout");
    
    }
    
   
     public static void main(String[] args) {
     //Instance of the scanner object created 
     Scanner input = new Scanner(System.in);
     /*
       An ArrayList of integer data type "total_price" is initialized in order to store the price of each product selected by the user. Which  
       will later be used to calculate the total price at checkout when the user exits.
     */
     ArrayList<Integer> total_price = new ArrayList<>();  
     System.out.println("Dear customer, welcome to our NotApple store");
     //Initializing "exit".
     int exit = 1;
     //Condition for the while loop set.
     while (exit==1) {
         //Calling the method class within the while loop.
         product(); 
         System.out.println("\nEnter your option:");
         //Reads user input for the options. This line also declares a variable for the switch statement.
         int options = input.nextInt();
         /*
           Switch expression, "options". Every case has a default print statement, "Invalid option. Please try again" when the user inputs a
           value that is not in the options.
           Each case has a switch statement within it in order to provide further options (specifications/spec for each option) for the user to 
           choose from. 
           It then adds the chosen spec to the array list "total_price" using the .add method. 
           Each spec has been assigned a value that is the price of that spec for the product chosen.
         */
         switch (options) {
             //First case 
             case 1:
                 //Print statements to display the specification options for this particular option. That is option 1.
                 System.out.println("\nPlease select your NotApple iPhone 13");
                 System.out.println("1. Pearl 128gb £786");
                 System.out.println("2. Pearl 256gb £865");
                 System.out.println("3. Pearl 512gb £1,025");
                 //Reads user input for the spec of option 1.
                 int pearl_spec = input.nextInt();
                 //A switch statement for the "Pearl" spec with 3 cases as the spec has 3 options to choose from.
                 switch (pearl_spec) {
                     case 1: {
                         //declared a variable for the first option of this spec and set value at 786 as this is the price of this spec.
                         int spec_total = 786;
                         //Adds the chosen spec to the array list.
                         total_price.add(spec_total);
                         break;
                     }
                     case 2: {
                         //declared a variable for the second option of this spec and set value at 865 as this is the price of this spec.
                         int spec_total = 865;
                         total_price.add(spec_total);
                         break;
                     }
                     case 3: {
                         //declared a variable for the third option of this spec and set value at 1025 as this is the price of this spec.
                         int spec_total = 1025;
                         total_price.add(spec_total);
                         break;
                     }
                     default:
                         System.out.println("\nInvalid option. Please try again");
                         break;
                 }   break;
             
             case 2:
                 System.out.println("\nPlease select your NotApple iPhone 13 pro");
                 System.out.println("1. Coral 128gb £959");
                 System.out.println("2. Coral 256gb £1,059");
                 System.out.println("3. Coral 512gb £1,225");
                 int coral_spec = input.nextInt();
                 
                 switch (coral_spec) {
                     case 1: {
                     
                         int spec_total = 959;
                         total_price.add(spec_total);
                         break;
                     }
                     case 2: {
                     
                         int spec_total = 1059;
                         total_price.add(spec_total);
                         break;
                     }
                     case 3: {
                     
                         int spec_total = 1225;
                         total_price.add(spec_total);
                         break;
                     }
                     default:
                         System.out.println("\nInvalid option. Please try again");
                         break;
                 }   break;
             
             case 3:
                 System.out.println("\nPlease select your NotApple iPhone 13 pro max");
                 System.out.println("1. Coral 128gb £1,059");
                 System.out.println("2. Coral 256gb £1,159");
                 System.out.println("3. Coral 512gb £1,325");
                 int blue_spec = input.nextInt();
                 
                 switch (blue_spec) {
                     case 1: {
                     
                         int spec_total = 1059;
                         total_price.add(spec_total);
                         break;
                     }
                     case 2: {
                     
                         int spec_total = 1159;
                         total_price.add(spec_total);
                         break;
                     }
                     case 3: {
                     
                         int spec_total = 1325;
                         total_price.add(spec_total);
                         break;
                     }
                     default:
                         System.out.println("\nInvalid option. Please try again");
                         break;
                 }   break;
             
             case 4:
                 System.out.println("\nPlease select your NotApple airpod pro");
                 System.out.println("1. Standad £349");
                 System.out.println("2. Custom £399");
                 int airpod_spec = input.nextInt();
                 
                 switch (airpod_spec) {
                     case 1: {
                     
                         int spec_total = 349;
                         total_price.add(spec_total);
                         break;
                     }
                     case 2: {
                     
                         int spec_total = 399;
                         total_price.add(spec_total);
                         break;
                     }
                     
                  
                     default:
                         System.out.println("\nInvalid option. Please try again");
                         break;
                 }   break;
             //This case is when the user inputs wants to exit buying products and proceed to checkout.
             case 0:
                 System.out.println("\nThank you for shopping with NotApple!");
                 //Variable "exit" called for the program to exit the while loop. When user enters "0" the program will exit the while loop.
                 exit = 0;
                 break;
             default:
                 System.out.println("\nInvalid option. Please try again");
                 break;
         }
     }
     
        //Get the length of the array list to calculate the total price of the products selected.
        int array_list_length = total_price.size();
        //Declare total sum 
        int sum = 0;
        //For loop to go through every index of array list that contains the price of the products. 
        for(int i = 0; i<array_list_length; i++)
        {
            /*
              This formula calculates the total price of the products by adding the prices stores in the array list by adding the value stored  
              in every index to the variable "sum".
            */
            sum = sum + total_price.get(i);
        }
        //Prints the sum.
        System.out.println("\nDear customer, your total purchse is £" + sum);
    }
}
