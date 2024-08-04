class Solution {
    public int jump(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1;) {
            if (i == arr.length - 2)
                return ++ans;

            int range = arr[i];
            if (i + range >= arr.length - 1)
                return ++ans;
            int next = i;
            int far = arr[i];
            for (int j = i; j <= i + range; j++) {
                if (far < arr[j]+j) {
                    far = arr[j] + j;
                    next = j;
                }
            }
            ans++;
            if(far == arr[i]) i = i+range;
            else i = next;

        }
        return ans;
    }
}