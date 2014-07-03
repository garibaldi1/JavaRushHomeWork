package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer arr[] = new Integer[3];
        for (int a = 0; a < arr.length; a++)
        {
            arr[a] = Integer.parseInt(reader.readLine());

        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int b = 0; b < arr.length; b++)
        {
            System.out.println(arr[b]);
        }

    }
}
