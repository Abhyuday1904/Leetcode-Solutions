class Solution {
    public List<List<Integer>> subsets(int[] arr) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> a = new ArrayList<>();
        solve(ans , arr , 0 ,a);
        return ans;
    }
    public void solve(List<List<Integer>> ans, int arr[], int index, List<Integer> a) {
        int n = arr.length;
        if (index == n) {
          
            ans.add(new ArrayList<>(a));
            return;
        }

        
        a.add(arr[index]);
        solve(ans, arr, index + 1, a);

        a.remove(a.size() - 1);

        solve(ans, arr, index + 1, a);
    }
}