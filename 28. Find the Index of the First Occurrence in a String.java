class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0,j = needle.length();

        if( j == 0){
            return 0;
        }

        for(int k = 0 ; k <= haystack.length() - j ; k++){
            if(haystack.substring(i,i+j).equals(needle)){
                return i;
            }
            else{
                i+=1;
            }
        }
        return -1;
    }
}
