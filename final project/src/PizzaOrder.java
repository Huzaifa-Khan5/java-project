/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class PizzaOrder {
    public static void main(String[] args) {
        Menu m=new Menu();
        m.showMenu();
        CustomerInfo ci=new CustomerInfo();
        ci.showCustomerInfo();  
        Order o=new Order();
        Bill b=new Bill();
        o.Quantity();
        System.out.println();
        o.Flavour();
        System.out.println();
        o.Size();
        System.out.println();
        b.Drink();
        System.out.println("\n\t\t\t\t*****************************");
        System.out.println("\t\t\t\t    *****Total bill*****");
        System.out.println("\t\t\t\t*****************************");
        System.out.println("\t\t\t\tToken number is:    "+ci.id);
        System.out.println("\t\t\t\tCustomer name is:   "+ci.name);
        System.out.println("\t\t\t\tC.phone number is:  "+ci.phonenumber);
        System.out.println("\t\t\t\tC.type is:          "+ci.type);
        System.out.println("\t\t\t\tQuantity :          "+o.quantity);
        int totalprice=o.price1+o.price2+o.price3+b.price;
        System.out.println("\t\t\t\tTotal Amount is:    "+totalprice+"Rs");
        System.out.println("\n\t\t\t\t*****************************"); 
        System.out.println("\t\t\t\t     *****Thankyou*****");
        System.out.println("\t\t\t\t*****************************"); 
    }
}
