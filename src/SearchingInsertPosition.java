public class SearchingInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(searchInsert(arr, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            int j = i-1;
            if (nums[j] <=  target && nums[i] >= target) {
                if ((j + i) % 2 == 1) {
                    return ((j + i) + 1)/2;
                } else {
                    return (j + i)/2;
                }
            }
        }
        if (target < nums[0]) {
            return 0;
        } else {
            return nums.length;
        }
    }

}
