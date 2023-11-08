package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {

    // Parameters example 0.50 1.111
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        isBetween(x, y);        
    }

    private static void isBetween(double x, double y) {
        if (x < y) {
            if (x > 0 && y < 1) {
                StdOut.println("True");
            } else { StdOut.println("False");}
        } else {
            if (y > 0 && x < 1) {
                StdOut.println("True");
            } else {
                StdOut.println("False");
            }
        }
    }
    
}
