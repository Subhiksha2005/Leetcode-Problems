class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int s = 0;
            while (n != 0) {
                int a = n % 10;
                s += a * a;
                n = n / 10;
            }
            n = s;
        }
        return n == 1;
    }
}
