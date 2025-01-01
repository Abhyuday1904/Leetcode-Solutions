class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] arr, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i =0 ;i<r.length;i++){
            int first = l[i];
            int last = r[i] ;
            int a[] = new int[last - first + 1];
            int idx = 0;
            for(int j = 0;j<a.length;j++){
                a[j] = arr[first++];
            }
            Arrays.sort(a);
            int diff = a[1] - a[0];
            for(int j=1;j<a.length;j++){
                if(a[j] - a[j-1] != diff ) {
                    ans.add(false);
                    break;
                }
                if(j == a.length-1){
                    if(a[j] - a[j-1] == diff){
                        ans.add(true);
                    }
                }
            }
            
        }
        return ans;
    }
}