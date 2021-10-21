package com.company;
import com.company.CalcArab;
import com.company.RomanArab ;
import com.company.CalcRim;
import com.company.ArabRoman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String [] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        while (true) {
            System.out.println("Введите от 1 до 10 через пробел");
            String string =scanner.nextLine().toUpperCase();
            String [] str = string.split(" ");

            if (str.length !=3) {
                throw new Exception("Введите 2 числа через пробел.");
            }

            //Проверяем есть ли римские символы
            boolean flag1 = false;
            boolean flag2 = false;

            for (int i = 0; i < roman.length; i++) {
                if (roman[i].equals(str[0])) {
                    flag1 = true;
                 }
            }
            for (int i = 0; i < roman.length; i++) {
                if (roman[i].equals(str[2])) {
                    flag2 = true;
                }
            }
            if ((flag1==false && flag2==true)||(flag1==true && flag2==false)){
                System.out.println("Числа должны быть либо арабскими, либо римскими.");
            }

            //считаем римские цифры
            if(flag1==true && flag2==true){
                int num1R = RomanArab.convert(str[0]);
                int num2R = RomanArab.convert(str[2]);
                System.out.println(ArabRoman.convertAR(CalcRim.calc(num1R, num2R, str[1])));
            }else {
                // считаем арабские цифры
                int num1 = Integer.parseInt(str[0]);
                int num2 = Integer.parseInt(str[2]);
                System.out.println(CalcArab.calc(num1, num2, str[1]));
            }
    }
}
}
