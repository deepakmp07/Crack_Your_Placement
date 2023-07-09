class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> ts = new HashSet<Integer>();
        for(int a: nums){
            if(ts.add(a)){

            }
            else{
                return a;
            }
        }
    return 0;
    }
}