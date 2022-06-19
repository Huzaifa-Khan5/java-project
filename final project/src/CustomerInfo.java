
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CustomerInfo {
    String name,type;
    long phonenumber,id;
    Scanner input=new Scanner(System.in);
    void showCustomerInfo(){
        System.out.print("Enter Customer id:");
        id=input.nextLong();
        System.out.print("Enter Customer name:");
        name=input.next();
        System.out.print("Enter Customer phone number:");
        phonenumber=input.nextLong();
        System.out.print("Enter Customer type:");
        type=input.next();
        if(type.equals("dining")){
            System.out.println("Have a seat sir.");
        }
        else if(type.equals("takeaway")){
            System.out.println("Please order Sir");
        }
    }
}
