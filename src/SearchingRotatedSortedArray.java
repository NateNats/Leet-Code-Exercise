public class SearchingRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7};
        System.out.println(search(arr, 0));
    }
    public static int search(int[] nums, int target) {
//        int[] nums2 = Arrays.copyOfRange(nums, 0, nums.length/2);
//        int i = 0;
//
//        for (; i < nums.length/2; i++) {
//            nums[i] = nums[(nums.length/2)]++;
//        }
//
//        for (int j = 0; j < nums2.length; j++) {
//            nums[++i] = nums2[j];
//        }
//
//        for (int value = 0; value < nums.length; value++) {
//            if (nums[value] == target) {
//                return value;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
