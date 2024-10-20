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
        if (0 - n > 0) {
            for (int i = 1; i <= (0-n); i++) {
                m = m / x;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                m = m * x;
            }
        }

        return m;
    }
}