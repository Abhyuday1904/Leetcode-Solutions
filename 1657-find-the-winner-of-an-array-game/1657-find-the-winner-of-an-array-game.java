class Solution {
    public int getWinner(int[] arr, int k) {
          Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
        
            q.add(arr[i]);
            if(max<arr[i]) max = arr[i];
        }
        if(max<arr[0]) max = arr[0];
        if(k>=arr.length) return max;
        int count = 0;
        st.push(arr[0]);
       while(count<=k){
        if (st.peek() > q.peek()) {
            count++;
            q.add(q.remove());
        } else {
            count = 0;
            q.add(st.pop());

            st.push(q.remove());
            count++;

        }
        if (count >= k)
            return st.peek();

       }

        return 0;
    }
}