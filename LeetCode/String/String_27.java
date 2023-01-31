class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return valid(a, b) || valid(b, a);
    }
    
    private boolean valid(String a, String b) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != b.charAt(right)) {
                return isPalindrome(a, left, right) || isPalindrome(b, left, right);
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isPalindrome(String a, int start, int end) {
        while(start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
