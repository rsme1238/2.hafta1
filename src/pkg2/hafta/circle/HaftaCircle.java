
package pkg2.hafta.circle;

import java.util.Scanner;

public class HaftaCircle {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       
        System.out.println("Enter here the Radius: ");
        int r =input.nextInt();
        
      double m = 3.14 * r *2;
        
        System.out.println("circumference of a circle is: "+ m);
    }
    
}
