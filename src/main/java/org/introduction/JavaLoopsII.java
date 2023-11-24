package org.introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cont = 0;
            int aux1 = 0;
            while (cont < n) {
                if (cont == 0){
                    aux1 = (int) (a + (Math.pow(2,cont)) * b);
                } else {
                    aux1 = (int) (aux1 + (Math.pow(2,cont)) * b);
                }
                System.out.print(aux1 + " ");
                cont++;
            }
            System.out.println();
        }
        in.close();
    }
}
