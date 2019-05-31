package piggyBank;

import java.text.DecimalFormat;

public class Main
{
    public static void main (String[] args) 
    {
        System.out.println("*** Collection ***");
        System.out.println();

        Quarter quarter = new Quarter(1, "Quarter", 0.25);
        System.out.println(quarter);

        Dime dime = new Dime(1, "Dime", 0.10);
        System.out.println(dime);

        Dollar dollars = new Dollar(5, "Dollars", 1.00);
        System.out.println(dollars);

        Nickel nickel = new Nickel(3, "Nickels", 0.05);
        System.out.println(nickel);

        Dime dimes = new Dime (7, "Dimes", 0.10);
        System.out.println(dimes);

        Dollar dollar = new Dollar (1, "Dollar", 1.00);
        System.out.println(dollar);

        Penny pennies = new Penny(10, "Pennies", 0.01);
        System.out.println(pennies);

    }
}