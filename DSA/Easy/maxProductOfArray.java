class maxProductOfArray {
    public int maxProduct(int[] nums) {
        int min=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                min=max;
                max=nums[i];
            }else if(nums[i]>=min){
                min=nums[i];
            }
        }
        int product=(min-1)*(max-1);
        return product;
    }
}