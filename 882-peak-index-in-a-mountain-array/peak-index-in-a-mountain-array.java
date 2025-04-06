class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       return mountain(arr);
    }
      static int mountain(int[] arr) {
        int max = arr[0];
        for (int i=0; i< arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                max = i + 1;
            }
        }
        return max;
    }
}