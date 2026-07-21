class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int minheight=Math.min(height[left], height[right]);
            max=Math.max(max, width*minheight);

            if(height[left]<height[right]) left++;
            else if(height[right]<height[left]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}