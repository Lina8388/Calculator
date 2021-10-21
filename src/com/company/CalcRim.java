package com.company;

public class CalcRim {
    public static int calc (int num1, int num2, String operator) throws Exception {


        int result;
        if (num1 < 1 || num2 < 1 || num1 > 10 || num2 > 10 ) throw new Exception("Числа должны быть от I до X");

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                if (num1<num2) {throw new Exception("В римской системе нет отрицательных чисел");}
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num1/num2 == 0) {
                    throw new Exception("В римской системе нет отрицательных чисел");}
                result = num1/ num2;
                break;
            default:
                throw new Exception("Используйте только +, -, *, /");}
        return result;
    }
}
