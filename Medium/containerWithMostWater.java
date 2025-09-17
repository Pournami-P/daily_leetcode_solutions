//Day 17
class containerWithMostWater {
    public int maxArea(int[] height) {
        int end=height.length-1;
        int start=0;

        int maxCap=0;

        while(start<end){
            int h=Math.min(height[start],height[end]);
            int width=end-start;

            int currCap=h*width;

            maxCap=Math.max(maxCap,currCap);

            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxCap;
    }
}
