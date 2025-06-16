class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> set : map.entrySet()) {
        //     if(set.getValue() > 1) {
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // All unique
    }
}
