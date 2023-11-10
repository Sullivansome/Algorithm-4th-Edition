package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] result = histogram(a, 6);
        StdOut.println(sum(result) == a.length);
    }

    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            result[i] = count(a, i);
        }
        return result;
    }

    private static int count(int[] target, int key) {
        int result = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == key) {
                result++;
            }
        }
        return result;
    }
    
    private static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i ++) {
            result += array[i];
        }
        return result;
    }
}
