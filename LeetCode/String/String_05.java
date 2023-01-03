class Solution {
    public String sortSentence(String s) {
    String[] s1=s.split(" ");
    String[] s2=new String[s1.length];
    StringBuilder ans=new StringBuilder();
    for (String a:s1){
        int i=a.charAt(a.length()-1)-'0';
        s2[i-1]=a.substring(0,a.length()-1);
    }    
    for(String a:s2){
        ans.append(a);
        ans.append(" ");
    }
    ans.setLength(ans.length()-1);
    return ans.toString();
    }
}
