class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left =0;
        int right =height.length-1;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            max = Math.max(max,(right-left)*min);
            System.out.println(max);
                if(height[left]>height[right]){
                   right--;
                }
                else{
                    left++;
                }
        }
        return max;
    }
}