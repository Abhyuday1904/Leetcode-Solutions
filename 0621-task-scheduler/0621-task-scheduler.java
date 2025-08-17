class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0){
            return tasks.length;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : tasks){
            map.put(ch ,map.getOrDefault(ch,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int same = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            max = Math.max(max,value);
        }
        for(int val : map.values()){
            if(val == max){
                same++; 
            }
        }
        int window_ofDistinct = n+1;
        int total_window = ((max-1)*(n+1))+same; 
        return Math.max(total_window,tasks.length); 
    }
}