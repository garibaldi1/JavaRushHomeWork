package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int a = Integer.parseInt(reader.readLine());
        if (a > 0)
        {
            int [] numbers = new int[a];
            for (int b = 0; b < numbers.length; b++)
            {
                numbers[b] = Integer.parseInt(reader.readLine());
                if (numbers[b] > maximum)
                {
                    maximum = numbers[b];
                }
            }
        }
        System.out.println(maximum);
    }
}
