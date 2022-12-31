class Solution {
    public int maxRepeating(String sequence, String word) {
        String sb=word;
        int count=0;
        while(sequence.contains(sb)){
            count++;
            sb+=word;
        }
        return count;
    }
}
