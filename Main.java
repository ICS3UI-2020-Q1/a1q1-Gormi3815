import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    

    System.out.println("Please enter the temperature in Celceus");
   int currentTemperature = input.nextInt();
   int farenheight = currentTemperature*9/5+32;
   System.out.println("The current temperature is " + farenheight + ".");
  }
}
