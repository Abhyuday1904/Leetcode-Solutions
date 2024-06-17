class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while (left <= right) {
            long a = left*left;
            long b = right*right;
            if (a + b ==c)
                return true;

            if (a+b<c)
                left ++;

            
            else
                right --;
        }
        return false;
    }
}
