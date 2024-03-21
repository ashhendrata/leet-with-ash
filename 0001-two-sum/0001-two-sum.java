class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        int count = 0;
        for (int num: nums){
            if (freq_map.containsKey(target-num)){
                int[] res = new int[]{freq_map.get(target-num), count};
                return res;
            } else {
                freq_map.put(num, count);
            }
            count++;
        }
        return new int[]{};
    }
}