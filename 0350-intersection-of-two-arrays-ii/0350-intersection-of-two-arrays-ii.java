class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
         ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> nap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])) map.put(arr1[i] ,1);
            else map.put(arr1[i],map.get(arr1[i])+1);
        }
        for(int i=0;i<arr2.length;i++){
            if(!nap.containsKey(arr2[i])) nap.put(arr2[i] ,1);
            else nap.put(arr2[i],nap.get(arr2[i])+1);
        }
        for(int a: map.keySet()){
            if(nap.containsKey(a)){
                for(int i=0;i<Math.min(map.get(a),nap.get(a));i++){
                    ans.add(a);
                }
            }
        }
        int arr[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}