package Exercise13;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise13 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String principal = scanner.nextLine();

        System.out.print("What is the rate? ");
        String interestRate = scanner.nextLine();

        System.out.print("What is the number of years? ");
        String years = scanner.nextLine();

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compounded = scanner.nextLine();

        int Principal = Integer.parseInt(principal);
        double InterestRate = Double.parseDouble(interestRate);
        int Years = Integer.parseInt(years);
        int Compounded = Integer.parseInt(compounded);

        double Total1;
        double Total2;
        double Total3;

        Total1 = (1 + ((InterestRate/Compounded)/100));
        Total2 = Math.pow(Total1, Compounded*Years);
        Total3 = Principal*(Total2);

        System.out.print("$" + Principal + " invested at " + String.format("%.1f", InterestRate) + "% for " + Years + " years compounded " + Compounded + " times per year is $" + String.format("%.2f", Total3));





    }

}
