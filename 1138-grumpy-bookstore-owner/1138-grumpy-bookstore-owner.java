class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
         int len = customers.length;
        int j = 0, i = 0;
        int ans = -1;
        int leftIdx = 0;
        int rightIndex = 0;
        int unsatisfied = 0;
        while (j < len) {

            if (grumpy[j] == 1) {
                unsatisfied += customers[j];
            }
         
            if (j - i + 1 < k) {
                j++;
            } 
            
            else if (j - i + 1 == k) {
           
                if(ans<unsatisfied){
                    ans = unsatisfied;
                    leftIdx = i;
                    rightIndex = j;
                }

                if (grumpy[i] == 1) {
                    unsatisfied -= customers[i];
                }
                i++;
                j++;
            }
            
        }
     

        for (int a = 0; a < i; a++) {
            if (grumpy[a] == 0)
                ans += customers[a];
        }
        for (int a = j + 1; a < len; a++) {
            if (grumpy[a] == 0)
                ans += customers[a];
        }
        for(int a = i;a<j;a++){
            if(grumpy[a] == 0){
                ans += customers[a];
            }
            
        }
        return ans;
    }
}