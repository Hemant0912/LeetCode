class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if(entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // } 
        // return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        for(int val: set) {
            return val;
        }
        return 0;
    }
}