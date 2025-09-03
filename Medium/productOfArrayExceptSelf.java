//Day 14
class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] right=new int[n];
        int pro=1;

        for(int i=n-1;i>=0;i--){

            pro=pro*nums[i];
            right[i]=pro;
        }
        int left=1;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){

            ans[i]=left*right[i+1];
            left=left*nums[i];
        }

        ans[n-1]=left;
        return ans;
    }
}