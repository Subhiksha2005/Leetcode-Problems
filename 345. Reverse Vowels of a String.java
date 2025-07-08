class Solution {
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0 , j = n-1;
        while(i < j){
           if(isVowel(arr[i]) && isVowel(arr[j])){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
           }
           else if(isVowel(arr[i]) && !isVowel(arr[j])){
            j--;
           }
           else if(!isVowel(arr[i]) && isVowel(arr[j])){
            i++;
           }
           else{
            i++;
            j--;
           }
        }
        return new String(arr);
    }
}
