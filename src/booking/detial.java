
package booking;

import java.util.Scanner;

public class detial {
    
    String name;
    String last;
    int id;
    String dayin;
    String dayout;
    public void getDetial(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name :");
     name = input.nextLine();
    
    System.out.print("Enter your last name :");
    last = input.nextLine();
    
    System.out.print("Enter your ID Card :");
     id = input.nextInt();
    
    System.out.print("Check in :");      
    dayin = input.nextLine();
    dayin = input.nextLine();
    
    System.out.print("Check out :");
    dayout = input.nextLine();
    
    }  
    
    public int people(int num){
       int price;
        if(num <= 2){
           price = 500;  
        }else{
           price = 1500;
        }
        return price;
    }
}
