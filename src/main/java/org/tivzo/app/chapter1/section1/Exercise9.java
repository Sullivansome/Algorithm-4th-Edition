package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {

    public static void main(String[] args) {
        StdOut.println(intToBinary(32));
        StdOut.println("Expected: 100000");
    }

    private static String intToBinary(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i /= 2) {
            result.insert(0, i % 2);
        }
        return result.toString();
    }
    
}
