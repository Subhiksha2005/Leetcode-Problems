class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n;
        int i = m - 1;
        int j = l - 1;
        int k = n - 1;

        while (k >= 0) {
            if (i >= 0 && nums1[i] > nums2[k]) {
                 nums1[j] = nums1[i];
                i--;
            }
            else {
                nums1[j] = nums2[k];
                k--;
            }
            j--;
        }
    }
}
