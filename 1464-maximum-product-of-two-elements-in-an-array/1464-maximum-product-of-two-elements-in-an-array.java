class Solution {
    public int maxProduct(int[] nums) {
        int most_highest = 0;
        int second_highest = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] > most_highest){
                second_highest = most_highest;
                most_highest = nums[i];
            } else {
                second_highest = Math.max(nums[i], second_highest);
            }
        }
        return ((most_highest-1) * (second_highest-1));
    }
}