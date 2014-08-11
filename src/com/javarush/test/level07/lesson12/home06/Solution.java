package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human("Дед Вася", true, 65);
        Human grandpa2 = new Human("Дед Петя", true, 65);
        Human grandma1 = new Human("Баба Нюра", false,50);
        Human grandma2 = new Human("Баба Лариса",false,50);
        Human father = new Human("Данила", true, 35,grandpa1,grandma1);
        Human mother = new Human("Ольга", false, 30, grandpa2,grandma2);
        Human daughter = new Human("Наташа", false, 18,father,mother);
        Human oldSun = new Human("Виталик", true, 5, father,mother);
        Human juniorSun = new Human("Володя",true,10,father,mother);
        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(daughter.toString());
        System.out.println(oldSun.toString());
        System.out.println(juniorSun.toString());

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human(String name,boolean sex,int age,Human mother,Human father)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
