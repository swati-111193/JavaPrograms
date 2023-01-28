package com.java.programs;


import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubsequenceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];

         for (int j=0; j<n; j++) {

             int ele = sc.nextInt();
             arr[j] = ele;
         }
		//int a[] = {2,6,1,9,4,5,3,7};
		System.out.println(LongestSubsequenceArray.findLongestConseqSubseq(arr, n));
	}
	
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    Set<Integer> uniqueElements = new HashSet<Integer>();
	    for (int val : arr) {
	        uniqueElements.add(val);
	    }
	    int maxSubSeq = 0;
	    int currentMax;
	    for (int i = 0; i < N; i++) {
	        int currentVal = arr[i];
	        
	        currentMax = 0;
	        if (!uniqueElements.contains(currentVal - 1)) {
	            while (uniqueElements.contains(currentVal)) {
	                currentVal++;
	                currentMax++;
	            }
	            
	            maxSubSeq = Math.max(maxSubSeq, currentMax);
	        }
	    }
	    return maxSubSeq;
	}


}
