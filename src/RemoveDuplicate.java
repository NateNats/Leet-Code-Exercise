import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
    }

    public static ArrayList removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    break;
                } else {
                    arr.add(nums[i]);
                    i = j;
                    break;
                }
            }
        }
        arr.add(nums[nums.length-1]);
        return arr;
    }
}
