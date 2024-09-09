class Solution {
    public int minSetSize(int[] arr) {
        if(arr.length == 2){
            return 1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i] , 1);
            else map.put(arr[i] , map.get(arr[i])+1) ;
        }
        int a[] = new int[map.size()];
        int idx =0;
        for(int aa : map.values()){
            a[idx++] = aa;
        }
        Arrays.sort(a);
        int size = arr.length;
        int ans =0;
        idx--;
        while(size > arr.length/2){
            size = size - a[idx--];
            ans++;
        }
        return ans;
    }
}