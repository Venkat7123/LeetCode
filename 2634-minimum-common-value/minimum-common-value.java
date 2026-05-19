class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int common = -1;
        int ptr1 = 0, ptr2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(ptr1 < n1 && ptr2 < n2){
            if(nums1[ptr1] < nums2[ptr2]) ptr1++;
            else if(nums1[ptr1] > nums2[ptr2]) ptr2++;
            else{
                common = nums1[ptr1];
                break;
            }
        }
        return common;
    }
}