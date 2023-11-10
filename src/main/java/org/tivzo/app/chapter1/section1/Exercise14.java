package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
   
    public static void main(String[] args) {
        StdOut.println(lg(15));
        StdOut.println("Expected: 3");
    }

    private static int lg(int N) {
        int result = -1;
        for (int i = N; i > 0; i /= 2) {
            result++;
        } 
        return result;
    }
}
