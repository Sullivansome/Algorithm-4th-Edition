package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        int gcd = gcd(p, q);
        StdOut.println("The greatest common divisor of " + p + " and " + q + " is " + gcd + "\n");

        int gcd2 = gcd(1111111, 1234567);
        StdOut.println("The greatest common divisor of 1111111 and 1234567 is " + gcd2);

    }

    private static int gcd(int p, int q) {
        StdOut.println("p: " + p + " - q: " + q);
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
        
    }
}
