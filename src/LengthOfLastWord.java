public class LengthOfLastWord {
    public static void main(String[] args) {
        String nama = "Nicolaus Reva";
        System.out.println(lengthOfLastWord(nama));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
