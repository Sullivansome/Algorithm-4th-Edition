package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {

    public static void main(String[] args) {
        StdOut.println(intToBinary(32));
        StdOut.println("Expected: 100000");
    }


    private static String intToBinary(int N) {
        String result = "";
        for (int n = N; n > 0; n /= 2) {
            result = (n % 2) + result;
        }
        return result;
    }
    
}
