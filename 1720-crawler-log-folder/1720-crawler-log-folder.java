class Solution {
    public int minOperations(String[] logs) {
            int count=0;
    for(int i=0;i<logs.length;i++)
    {
      
       if(logs[i].charAt(0)!='.' && logs[i].charAt(0)!='/' && logs[i].charAt(logs[i].length()-1)=='/') count++;
        
       else if(logs[i].length()>2 && logs[i].charAt(0)=='.' && logs[i].charAt(0+2)=='/'){
       count--;      
        
       if(count<0) count=0;
       } 
        else
            continue;
      }
    
    return (count>-1)?count:0;
}
    }
