class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans = 0; 
        for(int i=0;i<worker.length;i++){
            int max = 0;
            for(int j =0 ;j<profit.length;j++ ){
                if(worker[i]>= difficulty[j]){
                    if(max < profit[j]) max = profit[j];
                }
            }
            ans += max;
        }
            return ans; 
    }
}