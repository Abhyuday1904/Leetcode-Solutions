class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(true) {
                if(s.size() == 0) {
                    s.push(arr[i]);
                    break;
                } else {
                    int prev = s.peek();
                    if(!(prev > 0 && arr[i] < 0)) {
                        s.push(arr[i]);
                        break;
                    }
                    if(Math.abs(prev) == Math.abs(arr[i]) ) {
                        s.pop();
                        break;
                    } else {
                        if(Math.abs(prev) < Math.abs(arr[i])) {
                            s.pop();
                        } else if(Math.abs(prev) > Math.abs(arr[i])) {
                            break;
                        }
                    }
                }
            }
        }
        int n  = s.size();
        int ans[] = new int[n];
        while(n > 0) {
            ans[--n] = s.pop();
        }
        return ans;
    }
}