package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		boolean isEqual = false;

		long len = String.valueOf(num).length();
		long summer = 0;

		String number = String.valueOf(num);
		char[] digits1 = number.toCharArray();
		for (int i = 0; i < digits1.length ; i++) {
			long tempNum = digits1[i] - 48;

			tempNum = (long) Math.pow(tempNum, len);
			summer = summer + tempNum;
		}
		if (num == summer) {
			isEqual = true;
		}
		try {
			return isEqual;
		} catch (NullPointerException e) {

			return isEqual;
		}

	}
}
