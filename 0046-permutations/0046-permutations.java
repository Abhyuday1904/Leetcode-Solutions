class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> inp = new ArrayList<>();
        for(int ele : arr){
            inp.add(ele);
        }
        solve(ans , arr , 0);
        return ans;
    }
    void solve(List<List<Integer>> ans ,  int arr[] , int index){
       if(index == arr.length){
        List<Integer> arrr =  new ArrayList<>();
        for(int aaa : arr ) arrr.add(aaa);
            ans.add(new ArrayList<>(arrr));
            return ; 
       }
        for(int j = index ; j<arr.length ; j++){
            swap(arr , index , j );
            solve(ans , arr , index + 1);
            swap(arr , index , j );
        }
    }
    void swap (int arr[] , int i , int j){
        int temp = arr[i] ; 
        arr[i] = arr[j];
        arr[j] = temp;
        return ;
    }
}