/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naz
 */
public class Money {
    
    private int dollars;
    private int cents;


    public Money(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative amounts are not allowed.");
            System.exit(0);
        } else {
            int totalCents = (int) (amount * 100);
            this.dollars = totalCents / 100; 
            this.cents = totalCents % 100;  
        }
    }


    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public Money add(Money other) {
        int totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        return new Money(totalCents / 100.0);
    }


    public Money subtract(Money other) {
        int totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }


    public int compareTo(Money other) {
        int thisTotalCents = this.dollars * 100 + this.cents;
        int otherTotalCents = other.dollars * 100 + other.cents;

        if (thisTotalCents < otherTotalCents) return -1;
        if (thisTotalCents > otherTotalCents) return 1;
        return 0;
    }


    
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
