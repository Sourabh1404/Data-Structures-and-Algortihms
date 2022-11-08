//Solution 1//
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int j = -1;
        if(ruleKey.equals("type"))
            j=0;
        else if(ruleKey.equals("color"))
            j=1;
        else
            j=2;

        int count = 0;
        for(int i=0;i<items.size();i++) {
            if(items.get(i).get(j).equals(ruleValue))
                count++;
        }
        
        return count;
        
    }
}




//Solution 2//

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
      String[] ans={"type","color","name"};
      int i,count=0;
      for(i=0;i<ans.length;i++){
          if(ruleKey.equals(ans[i]))
             {break;}
      }
      System.out.print(i);
      for(int j=0;j<items.size();j++){
          if(ruleValue.equals(items.get(j).get(i)))
          {count++;
        }
      }
      return count;

    }
}
