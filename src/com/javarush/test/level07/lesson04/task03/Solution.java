package com.javarush.test.level07.lesson04.task03;

import sun.launcher.resources.launcher_it;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] numbers = new int[10];
        for (int a = 0; a < 10; a++)
        {
        list[a] = reader.readLine();
        numbers[a] = list[a].length();
        }
            for (int b = 0; b < 10; b ++)
            {
                System.out.println(list[b]);
            }

        //Напишите тут ваш код
    }

}
