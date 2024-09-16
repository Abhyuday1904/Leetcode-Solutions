class Solution {
    public int findMinDifference(List<String> t) {
        int a[] = new int[t.size()];
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(t.get(i).substring(0,2)) * 60 + Integer.parseInt(t.get(i).substring(3,5));
        
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
    
        for(int i=0;i<a.length-1;i++){
            if(a[i+1] - a[i] >= 0){
                min = Math.min(a[i+1] - a[i],min);
            }
            
        }
        if(min <= 1) return min;
        for(int i=0;i<a.length-1;i++){
            if(a[i] <= 720){
                a[i] += 1440;
            }
        }
         Arrays.sort(a);
         for(int i=0;i<a.length-1;i++){
            if(a[i+1] - a[i] >= 0){
                min = Math.min(a[i+1] - a[i],min);
            }
            
        }
       // System.out.println(Arrays.toString(a));
        return min;
    }
}