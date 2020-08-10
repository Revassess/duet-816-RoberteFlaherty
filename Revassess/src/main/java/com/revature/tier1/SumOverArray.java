package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;

		try {
			if (arr.length == 0) {
				return sum;
			}


			for (int i = 0; i < arr.length ; i++) {
				if (arr.length == 0) {
					sum = Integer.parseInt(null);
				}
				sum = sum + arr[i];
			}
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException Caught");
		}
		return sum;
		}
	}
