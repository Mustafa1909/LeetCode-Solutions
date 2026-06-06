class Solution {
    public String reverseWords(String s) {
        char[] ch= s.toCharArray();
        int st = 0;
        for(int e =0;e<=ch.length;e++){
            if(e==ch.length||ch[e]==' '){
                reverse(ch,st,e-1);
                st=e+1;

            }
        }
return new String(ch);
  
    }
    private void reverse(char[] ch,int l,int r){
        while(l<r){
            char temp = ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
    }
}