/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        double amount_from, amount_to, rate_from, rate_to;

        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        amount_from = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        rate_from = input.nextDouble();

        rate_to = (100 / rate_from);
        amount_to = Math.round((amount_from/rate_to) * 100.0) / 100.0;


        System.out.print(amount_from + " euros at an exchange rate of " + rate_from + " is " + amount_to + " U.S. dollars.");

    }
}



