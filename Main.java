import java.util.Scanner;
/**
 * take an integer as a parameter and will print out every number that will divide the parameter evenly
 * @ Gavin Sandhar 
 */
public class Main {
  // method to calcualte factors of given number
  public static void factors(int number){
   for(int i = 1; number >= i; i++){
   int division = number % i;
   if (division == 0){
   System.out.println(i);
   }
   }
   }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user to enter number
    System.out.println("Please enter a number");

    // create variable for user input
    int number = input.nextInt();

    factors(number);
  }
}
