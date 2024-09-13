class Solution {
    public int maxWidthRamp(int[] arr) {
        int ans =0 ;
        Stack<Integer> st = new Stack<>();
        st.add(0);
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[st.peek()]) st.add(i);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=arr[st.peek()]) {
                while (!st.isEmpty() && arr[i]>=arr[st.peek()]) {
                    ans = Math.max(ans, Math.abs(i - st.peek()));
              //  System.out.println("Stack Element -> " + arr[st.peek()] + " current index number -> "+ arr[i] + " current index -> "  + i + " answer-> " + ans);
                st.pop();
                }
                if(st.isEmpty()) return ans;
            }
        }
       // System.out.println(st);
        return ans;
    }
}