package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*

Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
4. В программе должен использоваться цикл for.

*/

public class Main {
    public static void main(String[] args) throws Exception {
        String s = "8", s1 = "\n";
        for (int i2 = 0; i2 < 10; i2++){
            for(int i = 0; i <= i2; i++){
                System.out.print(s);
            }
            System.out.print(s1);
        }
    }
}

