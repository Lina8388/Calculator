package com.company;
public class ArabRoman {
    public static StringBuilder convertAR(int num)
    {
        //Перевод из арабских цифр в римские
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanChar = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanChar[i]);
            }
        }
        return roman;


}
}
