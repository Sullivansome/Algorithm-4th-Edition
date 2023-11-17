package org.tivzo.app.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.Particle;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//Add to the BinarySearch test client the ability to respond to a second argument:
// + to print numbers from standard input that are not in the whitelist,
// - to print numbers that are in the whitelist.
public class Exercise23 {

    public static void main(String[] args) {

        int[] whiteList = { 1, 2, 3, 4, 5 };
        char operation = args[0].charAt(0);

        if (operation != '-' && operation != '+') {
            throw new IllegalArgumentException("Operation must be - or +");
        }

        boolean searchForWhiteList = operation == '-';
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = binarySearch(key, whiteList);

            if (index != -1 && searchForWhiteList) {
                StdOut.println("Number in whitelist: " + key);
            } else if (index == -1 && !searchForWhiteList) {
                StdOut.println("Number not in whitelist: " + key);
            }
        }
    }

    private static int binarySearch(int key, int[] numbers) {
        return rank(key, numbers, 0, numbers.length - 1, 0);
    }

    private static int rank(int key, int[] arr, int lo, int hi, int depth) {
        if (depth != 0) {
            StdOut.println();
        }

        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < arr[mid]) {
                return rank(key, arr, lo, mid-1, ++depth);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid + 1, hi, ++depth);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }

}
