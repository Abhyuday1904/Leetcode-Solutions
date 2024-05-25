class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
			m1.put(s.charAt(i), i);
			m2.put(t.charAt(i), i);
		}
        for (char key : m1.keySet()) {
		    sum = sum + Math.abs(m1.get(key) - m2.get(key));
		}
        return sum;
    }
}