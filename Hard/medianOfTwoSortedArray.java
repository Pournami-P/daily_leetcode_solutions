//Day 9
class  medianOfTwoSortedArray{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans=merge(nums1,nums2);
        if(ans.length%2==0){
        double res = (ans[ans.length/2] + ans[(ans.length/2) - 1]) / 2.0;
            return res;
        }
        else{
            double res=(double)(ans[ans.length/2]);
            return res;
        }
    }
    public int[] merge(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] ans=new int[n1+n2];

        int p1=0;
        int p2=0;
        int p3=0;
        
        while(p1<n1||p2<n2){
            int val1=p1<n1?arr1[p1]:Integer.MAX_VALUE;
            int val2=p2<n2?arr2[p2]:Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3]=val1;
                p1++;
            }else{
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }

}
