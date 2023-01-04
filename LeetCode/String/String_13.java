class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder s=new StringBuilder();
        while(columnNumber>0){
            int n=(columnNumber-1)%26 + 'A';
            s.append((char)n);
            columnNumber=(columnNumber-1)/26;
        }
        s.reverse();
        return s.toString();
    }
}
