class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target == nums[mid]) {
                return mid;
            } // to check which part is sorted 
            if(nums[start] <= nums[mid]) { // left side is sorted
               if(target >= nums[start] && target < nums[mid]) {
                end = mid-1;
               } else {
                start = mid +1;
               }
            }
            else {
                if(nums[end] >= target && nums[mid] < target) { // right part is sorted
                   start = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }
        return ans;
    }
}