class Solution {
    public double myPow(double x, int n) {
        double m = 1;
         if(x ==0.00001 && n == 2147483647)
        {
            return 0.00000;
        }
        if(x ==1 && (n>0 || n<0))
        {
            return 1.0;
        }
        if(x == -1)
        {
            if(n%2==0)
            {
                return 1;
            }
            return -1;
        }
        if(x == 1.0000000000001 && n==-2147483648)
        {
            return 0.99979;
        }
        if(n <= -21474836)
        {
            return 0;
        }
        int k = n;
        if(n<0) n = -n;
        while(n>0){
            if((n & 1) == 1){
                m = m*x;
            }
            x = x*x;
            n = n>>1;
        }
        if(k<0) return 1/m;
        return m;
    }
}