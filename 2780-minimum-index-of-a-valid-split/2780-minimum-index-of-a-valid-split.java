class Solution {
    public int minimumIndex(List<Integer> arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int  i =0 ;i<arr.size();i++){
            map.put(arr.get(i) , map.getOrDefault(arr.get(i) , 0) + 1 );
        }
        // System.out.println(map);
        int max = -1;
        int maxi = -1;
        for(int a : map.keySet()){
            int freq = map.get(a);
            if(freq>max){
                maxi = a;
                max = freq;
            }
        }
      
        int a[] = new int[arr.size()];
        if(arr.get(0) == maxi){
            a[0] = 1;
        }
        else a[0] = 0;
        for(int i =1 ;i<a.length;i++){
            if(arr.get(i) == maxi){
                a[i] = a[i-1] + 1;
            }
            else a[i] = a[i-1];
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
       for(int i = 0 ; i<a.length-1;i++){
            int len = i+1;
            int left_len  = i+1;
            int right_len = a.length - i-1;
           
            if(2*a[i]>len && 2*(a[a.length-1] - a[i]) > right_len) return i;
       }
        return -1;
    }
}