class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l = 0;
      int maxlen = 0;
      int count []=new int[128];

      for(int ri =0;ri<s.length();ri++){
       char ch = s.charAt(ri);

       count[ch]++;
       while(count[ch]>1){
        count[s.charAt(l)]--;
        l++;
       }
       maxlen=Math.max(maxlen,ri-l+1);

      }
      return maxlen;
        
    }
}