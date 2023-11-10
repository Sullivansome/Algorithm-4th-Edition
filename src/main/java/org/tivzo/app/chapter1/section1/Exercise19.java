package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {

    // Recursion
    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    // Memoization
    // Memoization is a common technique in dynamic programming to optimize
    // recursive algorithms, making them viable for problems that would otherwise be
    // infeasible due to computational constraints.
    public static long anotherF(int n, long[] values) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        for (int i = 2; i <= n; i++) {
            values[i] = values[i - 2] + values[i - 1];
        }
        return values[n];
    }

    public static void main(String[] args) {
        // for (int N = 0; N < 100; N++)
        // StdOut.println(N + " " + F(N));
        for (int n = 0; n < 200; n++) {
            long[] values;

            if (n == 0 || n == 1) {
                values = new long[2];
            } else {
                values = new long[n + 1];
            }

            values[0] = 0;
            values[1] = 1;
            StdOut.println(n + ": " + anotherF(n, values));
        }
    }
}
