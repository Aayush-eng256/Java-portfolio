public class MergeSortedArray {
    public static void mergeSorted(int nums1[],int m,int nums2[],int n) {
        int idx = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[idx] = nums2[j];
                idx--;
                j--;
            } else {
                nums1[idx] = nums1[i];
                idx--;
                i--;
            }
        }
         while(j >= 0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
         }
        for(int p = 0;p<nums1.length;p++) {
            System.out.print(nums1[p]);
        }
        
    }
    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        mergeSorted(nums1,m,nums2,n);
    }
}
