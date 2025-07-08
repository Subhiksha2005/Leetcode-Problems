class Solution {
    public String reverseWords(String s) {
        String[] w = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < w.length ; i++){
            char[] c = w[i].toCharArray();
            int l = 0 , r = c.length-1;
            while(l < r){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
            res.append(c);
            if(i < w.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
