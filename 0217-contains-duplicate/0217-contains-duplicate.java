class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num_set= new HashSet<>();
        for (int num: nums){
            if (num_set.contains(num)){
                return true;
            } else {
                num_set.add(num);
            }
        }
        return false;
    }
}