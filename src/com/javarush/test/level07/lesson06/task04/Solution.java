package com.javarush.test.level07.lesson06.task04;

/* 5 строчек в начало списка
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало. 3.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();
        for (int a = 0; a < 5; a++)
        {
            String b = reader.readLine();
            list.add(0,b);
        }
        for(int c = 0; c < list.size(); c++)
        {
            System.out.println(list.get(c));
        }
        //Напишите тут ваш код

    }
}
