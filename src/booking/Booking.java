
package booking;
import java.util.Scanner;

public class Booking {

    
    public static void main(String[] args) {
        detial n = new detial();   
        
        System.out.println("\t\tRoom");
        System.out.println("****** Booking Room Service ******");
        System.out.println("Enter Gust Detial");
        
        n.getDetial();
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num of people >>>");
        int num = input.nextInt();
        
        int net = n.people(num);
        
        System.out.println("==============================");
        System.out.println("Name\t Lastnme\t IDcard");
        System.out.println("");
        System.out.println(n.name+"\t"+n.last+"\t"+n.id);
        System.out.println("==============================");
        System.out.println("Num of people :"+num);
        System.out.println("Check in :"+n.dayin);
        System.out.println("Check out :"+n.dayout);
        System.out.println("Total Price is "+net);
    }
    
    
}
