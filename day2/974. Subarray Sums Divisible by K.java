class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       HashMap<Integer,Integer> m = new HashMap<>();
       int count = 0;
       int sum = 0;
       m.put(0,1);
       for(int i=0;i<nums.length;i++){
           sum = sum+nums[i];
           int rem = sum%k;
           if(rem<0){
               rem = rem+k;
           }
           if(m.containsKey(rem)){
              count = count+m.get(rem);
              m.put(rem,m.get(rem)+1);
           }
           else {
               m.put(rem,1);
           }
       }
       return count;
    }
}