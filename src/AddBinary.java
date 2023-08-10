public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1011", "1010"));
    }

    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder value = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += Character.getNumericValue(a.charAt(i--));
            }

            if (j >= 0) {
                carry += Character.getNumericValue(b.charAt(j--));
            }
            value.append(carry%2);
            carry = carry/2;
        }

        return value.reverse().toString();
    }
}