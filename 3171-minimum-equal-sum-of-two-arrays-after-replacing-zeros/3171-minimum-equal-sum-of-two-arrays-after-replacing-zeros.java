class Solution {
    public long minSum(int[] arr1, int[] arr2) {
        int count1 = 0;
        long sum1 = 0;
        int count2 = 0;
        long sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            if (arr1[i] == 0)
                count1++;
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
            if (arr2[i] == 0)
                count2++;
        }
        if (count2 == 0 && count1 == 0 && sum1 != sum2)
            return -1;
        else if (count2 == 0 && (sum1 + count1) > sum2)
            return -1;
        else if (count1 == 0 && (sum2 + count2) > sum1)
            return -1;
        else if (sum1+count1 > sum2+ count2)
            return sum1 + count1;
        else if (sum1 + count1 < sum2 + count2)
            return sum2 + count2;
        else if(sum1 + count1 == sum2 + count2) return sum1+ count1;
        return sum1 + Math.max(count1, count2);
    }
}