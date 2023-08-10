import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XXIX"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0, preValue = 0, currValue = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            char currChar = s.charAt(i);
            currValue = romanValues.get(currChar);

            if (currValue < preValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            preValue = currValue;
        }
        return result;
    }
}
