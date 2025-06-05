class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2]; // this is simple ans
        
        int n = nums.length;
         HashMap<Integer, Integer> map = new HashMap<>();

         
         for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
         }
               
         for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > n/2) {
                return entry.getKey();
            }
         }
         return 0;
    }
}