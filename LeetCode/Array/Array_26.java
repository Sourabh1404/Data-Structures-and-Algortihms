class Solution {
    public int[] plusOne(int[] digits) {
for (int j = digits.length - 1; j >= 0; j--) {
	if (digits[j] < 9) {
		digits[j]++;
		return digits;
	}
	digits[j] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}
