class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //frequeoccrancesncy
        HashMap<Integer, Integer> occr = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!occr.containsKey(nums[i])){
                occr.put(nums[i], 1);
            } else {
                occr.put(nums[i], occr.get(nums[i])+1);
            }
        }

        //special array: bucket sort
        ArrayList<List<Integer>> bucket = new ArrayList<>(nums.length + 1);
        for (Integer num : occr.keySet()) {
            int frequency = occr.get(num);

            // Ensure the bucket list has enough capacity
            while (bucket.size() <= frequency) {
                bucket.add(new ArrayList<>());
            }

            bucket.get(frequency).add(num);
        }

        //put all in one table
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.size() - 1; i >= 0; i--) {
            List<Integer> currentBucket = bucket.get(i);
            result.addAll(currentBucket);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k ; i++){
            ans[i] = result.get(i);
        }
        return ans;


    }
}