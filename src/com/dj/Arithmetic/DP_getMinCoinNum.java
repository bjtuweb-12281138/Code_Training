package com.dj.Arithmetic;

public class DP_getMinCoinNum {
    public int getMinCoinNum(int[] coin, int total) {
        int[] dp = new int[total];
        dp[0] = 0;
        for (int i = 1; i < total; i++) {
            for (int j = 0; j < coin.length; j++) {
                if (i-coin[j]>=0 && dp[i-coin[j]]+1 < dp[i])
                dp[i] =dp[i-coin[j]]+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        DP_getMinCoinNum main = new DP_getMinCoinNum();

        int[] coin1 = {1, 2, 5};
        int total1 = 11;

        int[] coin2 = {1, 2, 5, 10};
        int total2 = 100;


    }
}
