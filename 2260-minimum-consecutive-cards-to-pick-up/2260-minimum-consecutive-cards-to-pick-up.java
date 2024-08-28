class Solution {
    public int minimumCardPickup(int[] arr) {
        int i=0;
        int j=0;
        int ans =Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<arr.length){
            if(!map.containsKey(arr[j])) map.put(arr[j],1);
            else map.put(arr[j] , map.get(arr[j])+1);

            if(map.get(arr[j]) < 2 ){
                j++;
            }
            else if(map.get(arr[j]) == 2) {

                 while(map.get(arr[j]) == 2) {
                    int count = map.get(arr[i]);
                    if(count > 1) map.put(arr[i] , map.get(arr[i]) - 1 );
                    else if(count <= 1) map.remove(arr[i]);
                    i++;
                }
                ans = Math.min(ans,j-i+1);
                j++;
            }
            else {
                while (map.get(arr[j]) > 2) {
                    int count = map.get(arr[i]);
                    if(count > 1) map.put(arr[i] , map.get(arr[i]) - 1 );
                    else if(count <= 1) map.remove(arr[i]);
                    i++;
                }
                if(map.get(arr[j]) == 2){
                    ans = Math.min(ans,j-i+1);
                }
                j++;
            }
        } 
        if(ans == Integer.MAX_VALUE) return -1;  
        return ans + 1; 
    }
}