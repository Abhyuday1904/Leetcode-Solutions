class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int aa : arr) {
            a.add(aa);
        }
        add_perm(ans, a, new ArrayList<>());
        return ans;
    }

    private void add_perm(List<List<Integer>> ans, ArrayList<Integer> a, ArrayList<Integer> out) {
        if (a.size() == 0) {
            ans.add(new ArrayList<>(out));
            return;
        }

        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> newA = new ArrayList<>(a);
            int removedElement = newA.remove(i);
            ArrayList<Integer> newOut = new ArrayList<>(out);
            newOut.add(removedElement);
            add_perm(ans, newA, newOut);
        }
    }
}
