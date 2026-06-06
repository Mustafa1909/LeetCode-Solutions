class Solution {
    public int compress(char[] chars) {
     int idx = 0;

     for(int i=0;i<chars.length;i++){
        char current = chars[i];
        int c = 0;

        while(i<chars.length&&chars[i]==current){
            i++;
            c++;
        } 
        i--;
        chars[idx++]=current;
        if(c>1){
            String cnt = String.valueOf(c);
            for(char ch : cnt.toCharArray()){
                chars[idx++]=ch;
            }
        }
     }
     return idx;
    }
}