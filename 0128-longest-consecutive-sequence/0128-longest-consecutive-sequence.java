class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length ==0 ) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int max = Integer.MIN_VALUE;
        
        for(int a : set){
            if(!set.contains(a-1)) {
                int count = 1;

                while(set.contains(a+1)){
                    count++;
                    a++;
                }
                max = Math.max(max , count);
            }
            
        }
        return max;
    }
}