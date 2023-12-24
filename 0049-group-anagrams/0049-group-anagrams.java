class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String word: strs){
            int[] count = new int[26];

            for (int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);
            
            if (!map.containsKey(key)){
                ArrayList<String> anagrams = new ArrayList<>();
                map.put(key, anagrams);
                anagrams.add(word);
            } else {
                map.get(key).add(word);
            }
        }
        return new ArrayList<>(map.values());
    }
}