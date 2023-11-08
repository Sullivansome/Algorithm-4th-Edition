package org.tivzo.app.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        print(array);
        transpose(array);
    }


    private static void transpose(int[][] array) {
        int M = array[0].length, N = array.length; // Structure should be inverted
        int[][] result = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = array[j][i];
            }
        }
        print(result);
    }

    private static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                StdOut.print(mat[i][j] + " ");
            }
            StdOut.println();
        }
    }
    
}
