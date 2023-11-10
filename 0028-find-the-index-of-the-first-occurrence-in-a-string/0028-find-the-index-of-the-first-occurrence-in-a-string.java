class Solution {
    public int strStr(String haystack, String needle) {
        int needleindex = 0;
        for (int window = 0; window < haystack.length(); window++){
            if (haystack.charAt(window)==needle.charAt(needleindex)){
                needleindex++;
            } else {
                window = window - needleindex;
                needleindex = 0;
            }
            if (needleindex == needle.length()){
                return window-needle.length() +1;
            }
        }
        return -1;
    }
}