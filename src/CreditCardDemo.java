/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naz
 */
public class CreditCardDemo {
   
    public static void main(String[] args) {
        

        // Named constants for testing
        final Money CREDIT_LIMIT = new Money(1000);  
        final Money FIRST_AMOUNT = new Money(200);    
        final Money SECOND_AMOUNT = new Money(10.02); 
        final Money THIRD_AMOUNT = new Money(25);    
        final Money FOURTH_AMOUNT = new Money(990);  

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        CreditCard visa = new CreditCard(owner, CREDIT_LIMIT);

        System.out.println("Owner: " + visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance().toString());
        System.out.println("Credit Limit: " + visa.getCreditLimit().toString());
        System.out.println(); 

        System.out.println("Attempting to charge " + FIRST_AMOUNT.toString());
        visa.charge(FIRST_AMOUNT);  
        System.out.println("Balance: " + visa.getBalance().toString());
        System.out.println(); 

        System.out.println("Attempting to charge " + SECOND_AMOUNT.toString());
        visa.charge(SECOND_AMOUNT);  
        System.out.println("Balance: " + visa.getBalance().toString());
        System.out.println(); 

        System.out.println("Attempting to pay " + THIRD_AMOUNT.toString());
        visa.payment(THIRD_AMOUNT);  
        System.out.println("Balance: " + visa.getBalance().toString());
        System.out.println(); 

        System.out.println("Attempting to charge " + FOURTH_AMOUNT.toString());
        visa.charge(FOURTH_AMOUNT);  
        System.out.println("Balance: " + visa.getBalance().toString());
    }
}
