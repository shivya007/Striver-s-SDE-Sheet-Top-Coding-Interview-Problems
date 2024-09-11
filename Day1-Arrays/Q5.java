// Sort an array of 0's, 1's and 2's --> 75. Sort Colors

class Solution {
    public void reverse(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while( mid <= high){
            if(nums[mid] == 0){
                reverse(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                reverse(nums, mid, high);
                high--;
            }
        }
    }
}