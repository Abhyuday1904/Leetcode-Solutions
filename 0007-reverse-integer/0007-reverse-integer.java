class Solution {
    public int reverse(int x) {
        long temp1 = x;
        if (temp1 < 0) {
            if (temp1 == Integer.MIN_VALUE) {
               
                temp1 = -(long) Integer.MIN_VALUE;
            } else {
                temp1 = -temp1;
            }
        }
        long ans = 0;
        int rem =0;
        while(temp1>0)
        {
            rem = (int) (temp1%10);
            ans = ans*10 + rem;
            temp1 = temp1/10;
        }
        if(ans<Integer.MIN_VALUE || ans >Integer.MAX_VALUE) return 0;
        int temp = Math.abs(x);
        String st = Integer.toString(temp);
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        String s = sb.toString();    
        int rev = Integer.parseInt(s);
        if(x<0) return 0-rev;
        else return rev;
    }
}