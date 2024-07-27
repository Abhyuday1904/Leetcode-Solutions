class Solution {
    public int[] findIntersectionValues(int[] arr1, int[] arr2) {
        int ans[] =  new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> nap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])) map.put(arr1[i],1);
            else map.put(arr1[i],map.get(arr1[i])+1);
        }
        for(int i=0;i<arr2.length;i++){
            if(!nap.containsKey(arr2[i])) nap.put(arr2[i],1);
            else nap.put(arr2[i],nap.get(arr2[i])+1);
        }

        int first = 0;
        int second  = 0;
        for(int a : map.keySet()){
            // System.out.println("a ->" +a);
            if(nap.containsKey(a)){
                first += map.get(a);
            }
            //System.out.println("first ->"+first);
        }
        for(int a : nap.keySet()){
            if(map.containsKey(a)){
                second += nap.get(a);
            }
        }
        ans[0]  = first;
        ans[1] = second;
        return ans;
    }
}