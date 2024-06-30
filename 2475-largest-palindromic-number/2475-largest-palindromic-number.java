class Solution {
    public String largestPalindromic(String s) {
         Boolean even = false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        // System.out.println(even);
        // System.out.println(map);
        if(map.size() == 1 && s.charAt(0) == '0'){
            return Character.toString(s.charAt(0));
        }
        if(map.size() == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        int arr[] =  new int[map.size()];
        int idx = 0;
        for(Character ch : map.keySet()){
            arr[idx++] = Character.getNumericValue(ch);
        }
        Arrays.sort(arr);
        Boolean zero = false;
        if(arr[0] == 0){
              zero = true;
        }
      //  System.out.println(Arrays.toString(arr));
        Boolean odd = false;
        if(zero){
            for(int i=1;i<arr.length;i++){
                if(map.get(Integer.toString(arr[i]).charAt(0)) >1 ) even = true;
            }
        }
        String mid = "";
        System.out.println(even);
        

        if(zero && even) {
            for(int i=map.size()-1;i>=0;i--){
                int a = map.get(Integer.toString(arr[i]).charAt(0));
                // System.out.println("Current Integer :" + Integer.toString(arr[i]));
                // System.out.println("Current frequency :" + a);
                if(a%2 == 0){
                     for(int j=0;j<(a/2);j++){
                        sb.append(Integer.toString(arr[i]));
                     }
                     System.out.println(sb);
                }
                else if(a%2 == 1){
                    if(a>1){
                        for(int j=0;j<(a/2);j++){
                            sb.append(Integer.toString(arr[i]));
                         }
                         if(odd == false){
                            mid = Integer.toString(arr[i]);
                            odd = true;
                         }
                         
                    }
                    if(a == 1 && odd == false){
                        mid = Integer.toString(arr[i]);
                        odd = true;
                    }
                } 
            }
        }
        else if(zero  && !even) {
            return Integer.toString(arr[arr.length-1]);
        }
        else {
            for(int i=map.size()-1;i>=0;i--){
                int a = map.get(Integer.toString(arr[i]).charAt(0));
                // System.out.println("Current Integer :" + Integer.toString(arr[i]));
                // System.out.println("Current frequency :" + a);
                if(a%2 == 0){
                     for(int j=0;j<(a/2);j++){
                        sb.append(Integer.toString(arr[i]));
                     }
                }
                else if(a%2 == 1){
                    if(a>1){
                        for(int j=0;j<(a/2);j++){
                            sb.append(Integer.toString(arr[i]));
                         }
                         if(odd == false){
                            mid = Integer.toString(arr[i]);
                            odd = true;
                         }
                         
                    }
                    if(a == 1 && odd == false){
                        mid = Integer.toString(arr[i]);
                        odd = true;
                    }
                } 
            }
        }
        StringBuilder ss =  new StringBuilder(sb);
        sb.append(mid);
        sb.append(ss.reverse());
        return sb.toString();
    }
}