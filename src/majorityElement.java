import java.util.Arrays;

public class majorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int first = 0;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[first] == nums[i]) {
                count++;
                if (count >= nums.length/2) {
                    return nums[first];
                }
            } else {
                count = 1;
                first = i;
            }
        }
        return -1;
    }
}
