package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();
        for (int i = 0; i < 5; i ++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        for (int a = 0; a < list.size(); a ++)
        {
            int b = list.size()- a - 1;
            System.out.println(list.get(b));
        }
    }
}