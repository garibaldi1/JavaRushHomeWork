package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[20];
        for (int a = 0; a < numbers.length; a++)
        {
            numbers[a] = Integer.parseInt(reader.readLine());
        }
        int [] numbers2 = new int[10];
        int [] numbers3 = new int[10];
        for (int a = 0; a < 10; a++)
        {
            numbers2[a] = numbers[a+1];
            numbers3[a] = numbers[10 + a];
            System.out.println(numbers3[a]);
        }


    }
}
