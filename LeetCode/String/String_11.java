class Solution {
    public boolean judgeCircle(String moves) {
    int x=0,y=0;
    for(char ch : moves.toCharArray()){
        switch(ch)
      {  case 'U': y++;
                continue;
         case 'D': y--;
                continue;
         case 'L': x--;
                continue;
       case 'R': x++;
                continue;
                }

    }
    return (x==0 && y==0);
    }
}
