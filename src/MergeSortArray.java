import java.util.Arrays;

public class MergeSortArray {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        int k = (m-n);

        if (m == 0) {
            System.out.println(Arrays.toString(nums2));
            return;
        } else if (n == 0) {
            System.out.println(Arrays.toString(nums1));
            return;
        }

        for (; i < nums1.length; i++) {
            if (nums1[i-1] > nums2[k]) {
                int temp = nums1[i-1];
                nums1[i-1] = nums2[k++];
                nums1[i] = temp;

            } else {
                nums1[i] = nums2[k++];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
