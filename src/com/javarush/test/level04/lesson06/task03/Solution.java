package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a < b && a < c && b < c)
        {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if (b < a && b < c && a <c)
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);


        //Напишите тут ваш код

    }
}
