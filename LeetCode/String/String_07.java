class Solution {
    public String toLowerCase(String s) {
        String sb=new String();
      for(char ch: s.toCharArray()){
          if(ch>=65 && ch<=90)
          {ch+=32;
           sb+=ch;}
          else
          sb+=ch;
      } 
      return sb.toString();
    }
}
