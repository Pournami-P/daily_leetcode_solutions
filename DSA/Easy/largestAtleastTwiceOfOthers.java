//Day 16
class largestAtleastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int index,secondMax,max;
        secondMax=max=index=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                index=i;
                secondMax=max;
                max=nums[i];
            }
            else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        if(secondMax*2<=max){
            return index;
        }
        return -1;
    }
}
