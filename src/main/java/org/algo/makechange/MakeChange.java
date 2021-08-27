package org.algo.makechange;

/*
O(nd) time
O(n) space
 */
public class MakeChange {

    public int calculate(int n, int[] denoms) {
        int[] ways = new int[n+1];
        ways[0] = 1;

        for(int denom : denoms) {
            for(int amount=1;amount<n+1;amount++) {
                if(denom <=amount) {
                    ways[amount] = ways[amount] + ways[amount - denom];
                }
            }
        }

        return ways[n];
    }
}