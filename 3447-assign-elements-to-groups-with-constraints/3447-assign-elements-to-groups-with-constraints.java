class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int ans[]  = new int[groups.length];
        Arrays.fill(ans , -1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<elements.length;i++){
            if(!map.containsKey(elements[i])){
                map.put(elements[i] , i);
            }
        }
   //     System.out.println(map);
        for(int i =0 ;i<groups.length;i++){
            int limit = (int)Math.floor(Math.sqrt(groups[i]));
            int min = Integer.MAX_VALUE;
            for(int j = 1;j<=limit;j++){
                if(groups[i]%j == 0){
                    if(map.containsKey(j)){
                        min = Math.min(min , map.get(j));
                    }
                    if(map.containsKey(groups[i]/j)){
                        min = Math.min(min , map.get(groups[i]/j));
                    }
                }
            }
            if(min != Integer.MAX_VALUE){
                ans[i] = min;
            }
            
        }
        return ans;
    }
}