package org.introduction;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double money = sc.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        Currency indianCurrency = Currency.getInstance("INR");
        in.setCurrency(indianCurrency);

        DecimalFormatSymbols symbols = ((DecimalFormat) in).getDecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs.");
        ((DecimalFormat) in).setDecimalFormatSymbols(symbols);


        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(money));
        System.out.println("India: " + in.format(money));
        System.out.println("China: " + ch.format(money));
        System.out.println("France: " + fr.format(money));
        sc.close();
    }
}