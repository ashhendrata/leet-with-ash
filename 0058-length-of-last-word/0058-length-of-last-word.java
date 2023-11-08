class Solution {
    public int lengthOfLastWord(String s) {
        int last = 0;
        int point = s.length();
        while (point > 0){
            point--;
            if (s.charAt(point) != ' '){
                last++;
            } else if (last > 0){
                return last;
            }
        }
        return last;
    }
}