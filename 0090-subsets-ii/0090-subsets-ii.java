class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> ans  = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> a = new ArrayList<Integer>() ;
        Arrays.sort(arr);
        solve(arr , set , 0 , a);
        for(List<Integer> aa : set){
            ans.add(aa);
        }
        return ans;
    }
    private void solve(int arr[] , HashSet<List<Integer>> set , int index , List<Integer> a){
        if(index == arr.length){
            set.add(new ArrayList<>(a));
            return ;
        }
        a.add(arr[index]);
        solve(arr , set , index + 1 , a);
        a.remove(a.size() - 1);
        solve(arr , set , index +1 , a);
        return ;
    }
}