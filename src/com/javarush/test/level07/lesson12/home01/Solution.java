package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();
        for (int i = 0; i < 10; i ++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        for (int a = 0; a < list.size(); a ++)
        {
            int b = list.size()- a - 1;
            System.out.println(list.get(b));
        }

        //Напишите тут ваш код
    }
}
