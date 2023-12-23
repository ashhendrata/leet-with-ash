class Solution {
    public int maxScore(String s) {
        int numOnes = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                numOnes++;
            }

        }
        int numZeros = 0;
        int max = 0;
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == '1'){
                numOnes--;
            } else {
                numZeros++;
            }
            max = Math.max(max, numOnes+numZeros);
        }
        return max;
    }
}