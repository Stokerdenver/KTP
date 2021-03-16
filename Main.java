package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
        {
        // Организация ввода аргументов с клавиатуры
        Scanner scan = new Scanner(System.in);
        // Задача 1/10 - минуты в секунды
        System.out.print("Введите число минут");
        int s = scan.nextInt();
        System.out.println(convert(s));
        // Задача 2/10 - Подсчет очков баскетболл
        System.out.print("Введите сначал кол-во 2-х очковых, а затем кол-во 3-х очковых");
        int p2 = scan.nextInt();
        int p3 = scan.nextInt();
        System.out.println(points(p2,p3));
        // Задача 3/10 - Подсчет очков футболл
        System.out.print("Введите кол-во побед-поражений-ничьих");
        int w = scan.nextInt();
        int l = scan.nextInt();
        int d = scan.nextInt();
        System.out.println(footballPoints(w,l,d));
        // Задача 4/10 - Делимость на 5
        System.out.print("Введите число для проверки");
        int n = scan.nextInt();
        System.out.println(divisibleByFive(n));
        // Задача 5/10 - Оператор &&
        System.out.print("Введите значения a и b, true или false");
        boolean a = scan.nextBoolean();
        boolean b = scan.nextBoolean();
        System.out.println(and(a,b));
        // Задача 6/10 - Кол-во полных стен
        System.out.print("Введите количество квадратных метров, ширину, высоту");
        int kvm = scan.nextInt();
        int shir = scan.nextInt();
        int vis = scan.nextInt();
        System.out.println(howManyWalls(kvm,shir,vis));
        // Задача 7/10 - Исправление ошибки
        System.out.print("Введите число, чтобы возвести в квадрат");
        int num = scan.nextInt();
        System.out.println(squaed(num));
        // Задача 8/10 - Формула какой-то там выгоды
        System.out.print("Введите значения prob-prize-pay");
        float prob = scan.nextFloat();
        float prize = scan.nextFloat();
        float pay = scan.nextFloat();
        System.out.println(profitableGamble(prob,prize,pay));
        // Задача 9/10 - Кадры в секунду
        System.out.print("Введите количество минут и кадров в секунду");
        int mins = scan.nextInt();
        int frames = scan.nextInt();
        System.out.println(frames(mins,frames));
        // Задача 10/10 - Остаток от деления без %
        System.out.print("Введите делимое и делитель");
        int del = scan.nextInt();
        int delit = scan.nextInt();
        System.out.println(mod(del,delit));


        }

    public static int convert(int min)
    {
        return min *= 60;

    }


    public static int points(int dva, int tri)
    {
        int rez;
        return  rez = 2 * dva + 3 * tri;
    }
    public static int footballPoints(int win, int loose, int draw)
    {   int rez;
        return  rez = 3 * win + draw;
    }
    public static boolean divisibleByFive(int n)
    {
        if (n % 5 ==0)
            return  true;
        else
            return false;
    }
    public static boolean and(boolean a, boolean b)
    {
        if(a && b)
            return true;
        else
            return false;
    }
    public static int howManyWalls(int n, int width, int height)
    {
        int perimetr;
        perimetr = width * height;
        return n / perimetr;
    }
    public static int squaed(int a)
    {
        return a * a;
    }
    public static boolean profitableGamble (float prob, float prize, float pay)
    {
        if (prob * prize > pay)
            return true;
        else return false;
    }
    public static int frames(int min, int frames)
    {
        int rez;
        return rez = 60 * min * frames;
    }


    public static int mod(int a, int b)
    {
        int j;
        j = a / b;
        return a - j * b;
    }
}
