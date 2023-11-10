class Solution {
    public int strStr(String haystack, String needle) {
        //let's try a Sliding Window technique
        for (int window = 0; window <= haystack.length() - needle.length(); window++){
            for (int needlepoint = 0; needlepoint < needle.length(); needlepoint++){
                if (haystack.charAt(window+needlepoint) != needle.charAt(needlepoint)){
                    break;
                }
                if (needlepoint == needle.length() -1){
                    return window;
                }
            }
        }
        return -1;
    }
}