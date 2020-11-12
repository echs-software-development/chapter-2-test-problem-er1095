
import java.util.Scanner;
public class Chapter2Test {
  public static void main(String[] args) {
  // gets input from user
  Scanner scan = new Scanner(System.in); 
  System.out.println("Enter two integers:");
  // i didnt know how to put the casting in 
  int Int1 = scan.nextInt();
  int Int2 = scan.nextInt(); 
  // calculates average 
  System.out.print("The average is: " + (Int1 + Int2) / 2.0);
  
  }
}