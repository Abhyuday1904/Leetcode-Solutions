class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        ArrayList<Integer> list = new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x = x/10;
        }
        for(int i=0,j=list.size() - 1 ; i<j ; i++ , j--){
            if(list.get(i) != list.get(j)) return false;
        }
        return true;
    }
}