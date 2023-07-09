class Solution {
    public void sortColors(int[] nums) {
        int r = 0;
        int m = 0;
        for(int i:nums){
           if(i==1){
               m++;
           }
           if(i==2){
               r++;
           }
        }
        int count=0;
        for(int i:nums){
            nums[count] = 0;
          if(count>(nums.length-(r+m+1))){
           if(m>0){
               nums[count] = 1;
               m--;
           }
           else
           nums[count] = 2;
          }
         count++;
        }
    }
}