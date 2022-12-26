class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length())
        {
            char a = name.charAt(i);
            char b = typed.charAt(j);
            if (a == b)
            {
                i++;
                j++;
            }
            else if (i > 0 && j > 0 && b == name.charAt(i - 1) && b == typed.charAt(j - 1))
            {
                j++;
            }
            else
                return false;
        }
        
        while (j < typed.length())
        {
            if (typed.charAt(j) == typed.charAt(j - 1))
                j++;
            else
                break;
        }
        
        if (i != name.length() || j != typed.length())
            return false;
        return true;
    }
}
