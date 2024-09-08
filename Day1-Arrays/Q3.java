//31. Next Permutation

class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        // step1: find the longer prefix match
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        // Edge case
         if(idx == -1){
            reverse(nums, 0, n-1);
            return;
         }
        // step2: find the closest greater number to array[idx] but which is smallest
        for(int i = n-1; i >= 0; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        // step 3: Now your remaining array from idx+1 is in increasing order always, just simply reverse the array
        reverse(nums, idx+1, n-1);
    }
}