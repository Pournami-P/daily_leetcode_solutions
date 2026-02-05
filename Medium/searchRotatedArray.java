class searchRotatedArray {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            int mid=(right+left)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[left]<=nums[mid]){
                if(target>=nums[left]&&target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}