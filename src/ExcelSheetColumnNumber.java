public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        int counter = 0;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
            char chara = columnTitle.charAt(i);
            chara = Character.toUpperCase(chara);

            sum += (int) (((int)chara - 'A' + 1) * Math.pow(26, counter++));
        }
        return sum;
    }
}