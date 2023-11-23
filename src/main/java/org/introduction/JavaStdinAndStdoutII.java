package org.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Double dou = sc.nextDouble();
        sc.nextLine();
        String tex = sc.nextLine();

        System.out.println("String: " + tex);
        System.out.println("Double: " + dou);
        System.out.println("Int: " + num);
    }
}
