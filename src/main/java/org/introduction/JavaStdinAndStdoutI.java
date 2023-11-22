package org.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}
