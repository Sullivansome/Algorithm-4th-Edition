package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {

    public static void main(String[] args) {
        StdOut.println(ln(5));
    }

    // Calculates ln(N!)
    public static double ln(int N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + ln(N - 1);
    }
    
}
