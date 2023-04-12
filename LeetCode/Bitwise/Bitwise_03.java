public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int r = 0;
        for (int i = 0; i < 32; i++) {
            // shift to the left, i.e. ...001 is changed into ...010
            r <<= 1; 
            // n&1 - keep 1 at the end of n if it ends with 1
            // | if n ends with 1, then res is also ends with 1
            r = r | (n & 1); 
            n >>= 1; // shift n to the right for 1 position
        }
        return r; 
    }
}
