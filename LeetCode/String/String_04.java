class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int j = -1;
        switch(ruleKey){
        case("type"):
            j=0;
            break;
        case("color"):
            j=1;
            break;
        case("name"):
            j=2;
            break;
        }

        int count = 0;
        for(int i=0;i<items.size();i++) {
            if(items.get(i).get(j).equals(ruleValue))
                count++;
        }
        
        return count;
        
    }
}
