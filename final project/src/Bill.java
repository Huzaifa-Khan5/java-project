


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Bill extends Order{
    int totalprice,quantity,price;
    String drink;   
        void Drink(){
            System.out.println("You want drink or not");
            System.out.println("The price of 1 drink is 50");
            System.out.println("Yes or no");
            drink=input.next();
            if(drink.equals("yes")){
                System.out.println();
                System.out.println("how many drink you want");
                quantity=input.nextInt();
                price=quantity*50;
                System.out.println("Total price of drink is:"+price);
            }
            else if(drink.equals("no")){
                System.out.println("Ok no problem");
            }
    }
        
}