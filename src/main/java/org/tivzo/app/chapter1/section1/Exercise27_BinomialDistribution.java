package org.tivzo.app.chapter1.section1;

public class Exercise27_BinomialDistribution {

    private static double[][] memo;

    public static double binomial(int N, int k, double p) {
        // Initialize memoization array on first call
        if (memo == null) {
            memo = new double[N + 1][k + 1];
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= k; j++) {
                    memo[i][j] = -1;
                }
            }
        }

        // Base case
        if ((N == 0) || (k < 0))
            return 1.0;

        if (memo[N][k] != -1)
            return memo[N][k];

        memo[N][k] = (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        return memo[N][k];
    }

   public static void main(String[] args) {
        double result = binomial(100, 50, 0.5);
        System.out.println("Binomial result: " + result);
   }
}
