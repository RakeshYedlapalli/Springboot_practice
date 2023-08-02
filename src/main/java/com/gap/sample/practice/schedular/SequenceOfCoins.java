package com.gap.sample.practice.schedular;

public class SequenceOfCoins {

    public static void main(String[] args) {
      int numberOfFlips =  new SequenceOfCoins().minFlipsMonoIncr("010110");
        System.out.println(numberOfFlips);
    }

    public int minFlipsMonoIncr(String S) {
        int N = S.length();
        int[] P = new int[N + 1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + (S.charAt(i) == '1' ? 1 : 0);

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= N; ++j) {
            ans = Math.min(ans, P[j] + N-j-(P[N]-P[j]));
        }

        return ans;
    }
}
