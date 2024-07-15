class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<pos.length;i++){
            map.put(pos[i],speed[i]);
        }
        Arrays.sort(pos);
        for(int i=0;i<pos.length;i++){
            speed[i] = map.get(pos[i]);
        }
        double time[]  = new double[pos.length];
        for(int i=0;i<pos.length;i++){
            time[i] = (double)(target-pos[i])/speed[i];
        }
        int fin[] = new int[pos.length];
        for (int i = time.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && time[st.peek()] < time[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                fin[i] = -1;
            } else {
                fin[i] = st.peek();
            }

            st.push(i);
        }
     for(int i=0;i<fin.length;){
        if(fin[i]!=-1){
            while(fin[i]!=-1){
                i++;
            }
            i++;
            ans++;
        }
        else{
            ans++;
            i++;
        }
     }
        return ans;
    }
}