public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(convertToTitle(i));
        }

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder value = new StringBuilder();
        while (columnNumber > 0) {
            --columnNumber;
            int n = columnNumber%26;
            columnNumber/= 26;
            value.append((char) (65 + n));
        }

        return value.reverse().toString();
    }
}