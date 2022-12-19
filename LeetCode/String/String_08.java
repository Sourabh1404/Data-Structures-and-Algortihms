class Solution {
    public boolean halvesAreAlike(String s) {
   
     String sb2=s.substring(s.length()/2,s.length());
     int count1=0;
     int count2=0;
     String sb1=s.substring(0,s.length()/2);
 
     for (char ch : sb1.toCharArray()){
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch== 'E'||ch== 'I'||ch== 'O'||ch== 'U')
        count1++;
     }  
     for (char ch : sb2.toCharArray()){
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch== 'E'||ch== 'I'||ch== 'O'||ch== 'U')
        count2++;
     } 
     if(count1==count2)
     return true;

     return false; 
    }
}
