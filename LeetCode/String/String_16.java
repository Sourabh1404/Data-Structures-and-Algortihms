//Solution1//

class Solution {
    public boolean isPalindrome(String s) {
        String a= s.toLowerCase();
        StringBuilder sb= new StringBuilder();
        for (char ch : a.toCharArray()){
            if( ch>=97 && ch<=122 || ch>=48 && ch<=57){
                sb.append(ch);
            }
        }
        String sc= new String(sb);
        int i=0;
        int e=sc.length()-1;
        System.out.println(sc);
        while(i<=e){
            if (sc.charAt(i)!=sc.charAt(e))
            return false;
            else{
                i++;
                e--;
            }
        }
        return true; 
    }
}

//Solution2//

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (isValid(l)) {
                if (isValid(r)) {
                    if (l != r) return false;
                } else {
                    right--;
                    continue;
                }
            } else {
                left++;
                continue;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c) {
        return c >= 'a' &&  c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
}
