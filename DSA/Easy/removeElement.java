//Day 12
class removeElementt {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
