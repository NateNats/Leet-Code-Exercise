public class FIndTheIndex {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        final int p1 = haystack.length();
        final int p2 = needle.length();
        for (int i = 0; i < p1 - p2 + 1; i++) {
            if (haystack.substring(i, needle.length()+i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}