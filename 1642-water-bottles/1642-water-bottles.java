class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int curr=numBottles;
	        while(numBottles>=numExchange){
	            curr = curr + numBottles/numExchange;
	            numBottles=(numBottles%numExchange)+(numBottles/numExchange);  
	        }
	        return curr;
    }
}