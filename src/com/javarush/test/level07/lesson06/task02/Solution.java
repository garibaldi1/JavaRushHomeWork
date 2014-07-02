package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>numbers = new ArrayList<String>();
        numbers.add("101");
        numbers.add("102");
        numbers.add("103");
        numbers.add("104");
        numbers.add("105");
        numbers.remove(0);
        numbers.remove(1);
        numbers.remove(2);
        for (int a = 0; a < numbers.size(); a++)
        {
            System.out.println(numbers.get(a));
        }
        System.out.println(numbers.size());

        //Напишите тут ваш код

    }
}
