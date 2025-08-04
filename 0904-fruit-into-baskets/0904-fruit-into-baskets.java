class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int ans = 0; 

        while(j<arr.length){
            if(!map.containsKey(arr[j])) map.put(arr[j],1);
            else map.put(arr[j] , map.get(arr[j])+1);
            if(map.size()<2){
                j++;
            }
            else if(map.size() == 2  && j-i+1>ans){
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else {
                while(map.size()>2 && j-i+1>ans){
                    
                    if(map.get(arr[i])>1) map.put(arr[i]  ,  map.get(arr[i]) -1);
                    else if(map.get(arr[i]) <=1) map.remove(arr[i]);
                    i++;
                }
                j++;
            }
        }
        if(map.size() == 1) return arr.length;
        return ans;
    }
}