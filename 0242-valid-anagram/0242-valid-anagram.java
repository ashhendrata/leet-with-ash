class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq_map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            Character curr = s.charAt(i);
            if (!freq_map.containsKey(curr)){
                freq_map.put(curr, 1);
            } else {
                freq_map.put(curr, freq_map.get(curr)+1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            Character t_curr = t.charAt(i);
            if (!freq_map.containsKey(t_curr)){
                return false;
            } else {
                freq_map.put(t_curr, freq_map.get(t_curr) - 1);
            }
        }
        for (Character key: freq_map.keySet()){
            if (freq_map.get(key) != 0){
                return false;
            }
        }
        return true;
    }
}