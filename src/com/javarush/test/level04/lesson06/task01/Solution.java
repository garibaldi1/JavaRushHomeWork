package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int na = Integer.parseInt(a);
        int nb = Integer.parseInt(b);
        if (na > nb)
        {
            System.out.println(nb);
        }
        else
        {
            System.out.println(na);
        }

        //Напишите тут ваш код

    }
}