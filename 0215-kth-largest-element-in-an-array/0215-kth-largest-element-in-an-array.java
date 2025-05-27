class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx =0;
        for(int i=0;i<arr.length;i++)
        {   
            pq.add(arr[idx++]);
            if(pq.size()>k){
                pq.poll();
            }
        }
      //  System.out.println(pq);
      //  System.out.println(pq.peek());
      
              return pq.peek();
    }
}