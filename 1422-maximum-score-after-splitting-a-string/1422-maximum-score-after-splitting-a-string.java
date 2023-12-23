class Solution {
    public int maxScore(String s) {
        HashMap<String, String> stringMap = new HashMap<>();
        for (int i = 1; i < s.length(); i++){
            String left = s.substring(0, i);
            String right = s.substring(i);
            stringMap.put(left, right);
            //System.out.println(left + " " + right);

        }
        int max = 0;
        int score = 0;
        for (String key: stringMap.keySet()){
            for (int i = 0; i < key.length(); i++){
                if (String.valueOf(key.charAt(i)).equals("0")){
                    score++;
                }
            }
            for (int i = 0; i < (stringMap.get(key)).length(); i++){
                if (String.valueOf((stringMap.get(key)).charAt(i)).equals("1")){
                    score++;
                }
            }
            if (score > max){
                max = score;
            }
            score = 0;
        }
        return max;
        
    }
}