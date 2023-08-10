public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String y = Integer.toString(x);
        String[] z = y.split("");
        String result = "";
        int y1 = Integer.parseInt(y);

        for (int i = z.length-1; i >= 0; i--){
            result += z[i];
        }

        int z1 = Integer.parseInt(result);

        if (y1 == z1){
            return true;
        } else {
            return false;
        }
    }
}
