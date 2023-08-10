public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }

    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57) || (int)s.charAt(i) == 43 || (int)s.charAt(i) == 45) {
                sb.append(s.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
