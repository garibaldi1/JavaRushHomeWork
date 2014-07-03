package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();
        for (int a = 0; a < 5; a++)
        {
            String b = reader.readLine();
            list.add(b);
        }
        for (int b = 0; b < list.size(); b++)
        {
            int c = list.size() - b - 1;
            System.out.println(list.get(c));
        }
        //Напишите тут ваш код

    }
}
