class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        if(cost1 > total  && cost2 > total ) return 1;
        int max = Math.max(cost1 , cost2);
        int min  = Math.min(cost1,cost2);
        int countmax = total / max;
        for(int i=0;i<=countmax;i++){
            ans += ((total - i*max)/min) + 1 ;
        }
        return ans;
    }
}