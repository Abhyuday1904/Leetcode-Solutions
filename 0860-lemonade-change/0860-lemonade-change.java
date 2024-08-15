class Solution {
    public boolean lemonadeChange(int[] arr) {
        if(arr[0]!= 5) return false;
        int count5 = 0;
        int count10 = 0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == 5){
                count5++;
            }
            else if(arr[i] == 10){
                if(count5 <1 ) return false;
                count10++;
                count5 -- ;
            }
            else {
                if(count10 <1 && count5 <3) return false;
                else if(count5 < 1 ) return false;
                if(count10 >= 1 ){
                    count5--;
                count10--;
                }
                else {
                    count5 = count5 - 3;
                }
                
            }
            
            
        }
        return true;
    }
}