class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<word.length();i++){
            int count = 1;
            while(i<word.length()-1&&word.charAt(i)==word.charAt(i+1)){
                count++;
                i++;
            }
           
               while(count>9){
                sb.append(9);
                sb.append(word.charAt(i));
                count-=9;
               }
               sb.append(count);
               sb.append(word.charAt(i));
        }
        return sb.toString();
        
    }
}