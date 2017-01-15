

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут

        Reader r = new InputStreamReader(System.in);  //создаем возможность ввода
        BufferedReader reader = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>(); // создаем массив на 10 для введенных данных
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s); //ввводим 10 значений в массив
        }

        ArrayList<String> result = doubleValues(list);
        for (String s : result)
        {
            System.out.println(s);
        }


        //Вывести на экран result
        for (int j = 0; j < result.size() ; j++)
        {
            System.out.println(result.get(j));//выводим на экран все ячейки.
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) //тело метода
    {
        for (int i = 0; i < list.size(); i++) //цикл по всей длинне метода (10)
        {
            //каждый элемент массива должен повторятся 2 раза
            list.add(i, list.get(i));
            i+=2;
        }

        return list;//ничего не возвращаем, просто повторяет каждый элемент массива
    }
}