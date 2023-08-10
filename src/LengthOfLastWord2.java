public class LengthOfLastWord2 {
    public static void main(String[] args) {
        String nama = "Nicolaus Reva  ";
        System.out.println(lengthOfLastWord(nama));
    }

    public static int lengthOfLastWord(String s) {
        int start = s.length()-1;
        int count = 0;

        while(count == 0) {
            for (int i = start; i >= 0; i--) {
                if (s.charAt(i) != ' '){
                    count++;
                }

                if (s.charAt(i) == ' ' && count > 0) {
                    break;
                }
            }
        }
        return count;
    }
}
