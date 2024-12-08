class Solution {
    public int isPrefixOfWord(String sentence, String sea) {
        String array[] = sentence.split(" ");
        for(int i=0;i<array.length;i++){
            String s = array[i];
            if(s.charAt(0) == sea.charAt(0) && s.length() >= sea.length()){
                int j =0 ;
                while(j<sea.length()){
                    if(s.charAt(j) == sea.charAt(j)){
                        j++;
                    }
                    else break;
                }
                if( j == sea.length()) return i+1;
            }
        }
        return -1;
    }
}