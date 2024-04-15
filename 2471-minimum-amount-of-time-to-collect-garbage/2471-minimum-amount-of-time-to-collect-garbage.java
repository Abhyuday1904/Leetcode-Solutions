class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int len = garbage.length;
        int time = 0;
        int totaltravel[] = new int[len];
        totaltravel[0] = 0;
        totaltravel[1] = travel[0];

        for (int i = 2; i < len; i++) {
            totaltravel[i] = totaltravel[i - 1] + travel[i - 1];
        }
        int countP = 0 ;
        int countG = 0;
        int countM = 0;
        int lastP = 0;
        int lastG = 0;
        int lastM = 0;
        for(int i=0;i<len;i++)
        {
            String s = garbage[i];
            int l = s.length();
            
            for(int j=0;j<l;j++)
            {
                if(s.charAt(j) == 'P') 
                {
                    countP++;
                    lastP = i;
                }
            }
            for(int j=0;j<l;j++)
            {
                if(s.charAt(j) == 'G') 
                {
                    countG++;
                    lastG = i;
                }
            }
            for(int j=0;j<l;j++)
            {
                if(s.charAt(j) == 'M') 
                {
                    countM++;
                    lastM = i;
                }
            }
        }
        // System.out.println(countG + " " + countM +  " " + countP);
        // System.out.println(lastG + " " + lastM + " " + lastP);
        time = countG + totaltravel[lastG] + countM + totaltravel[lastM]  + countP + totaltravel[lastP];
        return time;
    }
}