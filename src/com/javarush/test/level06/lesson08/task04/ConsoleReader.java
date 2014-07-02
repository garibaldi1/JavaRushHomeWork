package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{

    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;
       //Напишите тут ваш код
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());
        return c;
        //Напишите тут ваш код
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble(reader.readLine());
        return b;   //Напишите тут ваш код

    }

    public static void readLn() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String p=reader.readLine();
        while(p.equals(""))
            p=reader.readLine();

        //Напишите тут ваш код

    }
}
