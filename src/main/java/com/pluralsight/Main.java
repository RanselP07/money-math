package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {

        float f = 0f;
        double d = 0;
        BigDecimal z = BigDecimal.ZERO;
        BigDecimal tenCents = new BigDecimal(".1");
        BigDecimal bigValue = new BigDecimal("19.99");

        System.out.println("Adding .1, 10 times:");
        for (int i = 1; i <= 10; i++) {
            f += .1;
            d += .1;
            z = z.add(tenCents);

            System.out.println("\n" + i + ". Float: " + f + " Double: " + d + " BigDecimal: " + z);
            System.out.print("Does the float compare with the double? ");

            if (f == d){
                System.out.print("yes\n");
            } else {
                System.out.print("no\n");
                System.out.printf("Float: %.20f", f);
                System.out.printf(" does not equal to %.20f ", d);
                System.out.println();
            }

            System.out.print("Does the double compare with the BigDecimal? ");

            if (BigDecimal.valueOf(d).compareTo(z) == 0){
                System.out.print("yes\n");
            } else {
                System.out.print("no\n");
                System.out.printf("Double: %.20f", f);
                System.out.printf(" does not equal to %.20f ", z);
                System.out.println("It's off by");
            }
        }

        f = 0f;
        d = 0;
        z = BigDecimal.ZERO;

        for (int j = 1; j <= 1000; j++) {
            f += 19.99;
            d += 19.99;
            z = z.add(bigValue);
        }

        System.out.println("\nAdding 19.99, 1,000 time:\n");
        System.out.println("Float: " + f + " Double: " + d + " BigDecimal: " + z);

        System.out.print("Does the float compare with the double? ");
        if (f == d){
            System.out.print("yes\n");
        } else {
            System.out.print("no\n");
            System.out.printf("Float: %.20f", f);
            System.out.printf(" does not equal to %.20f ", d);
            System.out.println();
        }

        System.out.print("Does the double compare with the BigDecimal? ");

        if (BigDecimal.valueOf(d).compareTo(z) == 0){
            System.out.print("yes\n");
        } else {
            System.out.print("no\n");
            System.out.printf("Double: %.20f", f);
            System.out.printf(" does not equal to %.20f ", z);
            System.out.println();
        }

        System.out.printf("\nThe float is off by %.2f", (f - d));
        System.out.print(" cents (give or take a cent)!");
    }
}
