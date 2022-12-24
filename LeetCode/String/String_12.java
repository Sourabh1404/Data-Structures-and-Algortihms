class Solution {
    public String reverseWords(String s) {
    String[] st = s.split(" ",0);
    StringBuffer sb=new StringBuffer();
    for ( String a:st){
        StringBuffer b=new StringBuffer(a);
        sb.append(b.reverse()+" ");
    }
    sb.setLength(sb.length()-1);
    return sb.toString();
    }
}
