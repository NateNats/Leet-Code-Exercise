import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length-1;

        for (int i = n; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newArr = new int[n+2];
        newArr[0] = 1;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = digits[i-1];
        }
        return newArr;
    }
}
