package org.example;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= -100 && num <= 100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
