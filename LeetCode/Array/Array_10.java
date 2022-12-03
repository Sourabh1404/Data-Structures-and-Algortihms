class Solution {
    public boolean checkIfPangram(String sentence) {
     int[] ans=new int[26];
     for(char i:sentence.toCharArray()){
         ans[(int)i-97]=1;
     }   
    for(int i:ans)
   { if(i==0)
    return false; 
    }
    return true;
    }
}
