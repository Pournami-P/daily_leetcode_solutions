class waterBottles{
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange){
            return numBottles;
        }else{
            int temp=numBottles;
            
            while(numBottles>=numExchange){
                int remBottles=numBottles%numExchange;
                numBottles/=numExchange;
                temp+=numBottles;
                numBottles+=remBottles;
            }return temp;
        }
    }
}