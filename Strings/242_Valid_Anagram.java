import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();

        if(s.length()==t.length()){
            char[] chh1 = s.toCharArray();
            char[] chh2 = t.toCharArray();
            Arrays.sort(chh1);
            Arrays.sort(chh2);
            return Arrays.equals(chh1,chh2);

        

        }
        return false;
    }
}