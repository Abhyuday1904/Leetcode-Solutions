class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
        if (arr.length % k != 0)
            return false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        //    System.out.println(list);
        while (list.size() > 0) {
            Collections.sort(list);
            int a = k;
       //     System.out.println(list);
            int curr = list.get(0);
       //     System.out.println(curr);
            while (a > 1) {

                if (!list.contains(curr + 1))
                    return false;
                else {
                    list.remove(Integer.valueOf(curr));
                    curr++;
                }
                a--;
            }
            list.remove(Integer.valueOf(curr));
        }
        return true;
    }
}