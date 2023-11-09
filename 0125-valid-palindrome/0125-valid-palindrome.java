class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int front = 0;
        int end = s.length()-1;
        while (front <= end){
            if (!Character.isLetterOrDigit(s.charAt(front))){
                front++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            } else {
                if (s.charAt(front) != s.charAt(end)){
                    return false;
                } 
                front++;
                end--;
            }
            
        }
        return true;
    }
}