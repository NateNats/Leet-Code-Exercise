import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexReturn = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target && i != j){
                    indexReturn[0] = j;
                    indexReturn[1] = i;
                    return indexReturn;
                }
            }
        }
        throw new RuntimeException();
    }

}
