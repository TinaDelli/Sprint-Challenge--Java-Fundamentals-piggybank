package piggyBank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{
    public static void main (String[] args) 
    {
        System.out.println("*** Collection ***");
        System.out.println();

        Quarter quarter = new Quarter(1, "Quarter", 0.25);

        Dime dime = new Dime(1, "Dime", 0.10);

        Dollar dollars = new Dollar(5, "Dollars", 1.00);
        dollars.totalAmt(1.00, 5);

        Nickel nickel = new Nickel(3, "Nickels", 0.05);
        nickel.totalAmt(0.05, 3);

        Dime dimes = new Dime (7, "Dimes", 0.10);
        dimes.totalAmt(0.10, 7);

        Dollar dollar = new Dollar (1, "Dollar", 1.00);

        Penny pennies = new Penny(10, "Pennies", 0.01);
        pennies.totalAmt(0.01, 10);

        ArrayList<AbstractCollection> myList = new ArrayList<AbstractCollection>();
        myList.add(quarter);
        myList.add(dime);
        myList.add(dollars);
        myList.add(nickel);
        myList.add(dimes);
        myList.add(dollar);
        myList.add(pennies);

        myList.forEach((c) -> System.out.println(c));
        // myList.forEach((c) -> System.out.println(c.getWorth()));
        
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double total = 0;
        for(AbstractCollection s : myList)
        {
            total += s.getWorth();
        }
        System.out.println();
        System.out.println("The piggy bank holds " + fp.format(total));

    }
}