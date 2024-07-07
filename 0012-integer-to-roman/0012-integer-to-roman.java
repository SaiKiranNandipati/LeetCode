import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {
        // Adding the Roman numeral mappings to the LinkedHashMap
        Map<Integer, String> romanNumerals = new LinkedHashMap<>();
        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");

        StringBuilder res = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            while (num >= key) {
                res.append(value);
                num -= key;
            }
        }

        return res.toString();
    }
}
