class Solution {
    public long maxMatrixSum(int[][] arr) {
        long sum = 0;
        int count  = 0;
        boolean isZero = false;
        int negMin  = Integer.MAX_VALUE;
        int posMin  = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                int elem = arr[i][j];
                if(elem>=0){
                     sum += elem;
                     if(elem == 0) isZero = true;
                     posMin = Math.min(posMin , elem);
                }
                else {
                    count++;
                    negMin = Math.min(negMin , 0 - elem);
                    sum+= -1*elem;
                }
            }
        }
        int min = Math.min(negMin , posMin);
        // System.out.println("min -> " + min + " count -> " + count + " sum -> " + sum) ;
        
        if(count%2 == 0) return sum;
        else{
            if(isZero) return sum ;
            return sum - (2*min);
        }
        
    }
}