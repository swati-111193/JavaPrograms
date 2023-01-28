package com.java.programs;


import java.util.Scanner;

public class CoinsProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int sum = sc.nextInt();
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 for (int j=0; j<n; j++) {

             int ele = sc.nextInt();
             arr[j] = ele;
         }
		 //int coins[] = { 1, 2, 3 };
	       // int n = coins.length;
	 
	        System.out.println(count(arr, n, sum));
	
	}
	
	static int count(int coins[], int n, int sum)
    {
 
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;
 
        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;
 
        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (n <= 0)
            return 0;
 
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(coins, n - 1, sum)
            + count(coins, n, sum - coins[n - 1]);
    }

}
