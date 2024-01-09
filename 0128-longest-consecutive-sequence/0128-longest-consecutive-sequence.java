class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num: nums){
            numSet.add(num);
        }
        int longest = 0;
        int length = 0;
        for (int number: numSet){
            if (!numSet.contains(number - 1)){
                length = 0;
                while (numSet.contains(number + length)){
                    length++;
                    longest = Math.max(longest, length);
                }
            }
        }
        return longest;
        
    }
}