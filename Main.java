// Importing Scanner class to accept input from the user 
import java.util.Scanner;
// Creating Main Class
class Main {
  public static void main(String[] args) {
// Using a print statement, ask the user for their first message 
    System.out.print("Enter your first message: ");
    Scanner input = new Scanner(System.in);
// Allocating the input to the first message variable (01)  
    String message01 = input.nextLine();
// Request the second input from the user
    System.out.print("Enter your second message: ");
    String message02 = input.nextLine();
// Using the System print with + symbols in the parenthesis to print both variables  
    System.out.println(message01 + " " + message02);
  }
}