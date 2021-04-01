package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)
    {   Scanner scan = new Scanner(System.in);
        System.out.print("номер дома и длина улицы");
        int num = scan.nextInt();
        int street = scan.nextInt();
        System.out.println(oppositeHouse(num,street));

        System.out.print("Имя Фамилия");
        String fn = scan.next();
        String ln = scan.next();
        System.out.println(nameShuffle(fn,ln));

        System.out.print("Введите цену и скидку в процентах");
        int price = scan.nextInt();
        int sale = scan.nextInt();
        System.out.println(discount(price,sale));
        System.out.print("Разность максимума и минимума: ");
        double[] array = new double[] { 44, 32, 86, 19 };
        System.out.println(differenceMaxMin(array));
        System.out.print("Введите 3 целых числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(equals(a,b,c));
        System.out.print("Введите слово");
        String s = scan.next();
        System.out.println(reverse(s));
        System.out.print("Введите почасовую оплату");
        int sal1 = scan.nextInt();
        int sal2 = scan.nextInt();
        int sal3 = scan.nextInt();
        System.out.println(programmers(sal1,sal2,sal3));
        System.out.print("Введите символы");
        String str = scan.next();
        System.out.println(getOX(str));

        System.out.print("БОМБА");
        String stroka = scan.next();
        System.out.println(bomb(stroka));

        System.out.print("Введите строки");
        String x = scan.next();
        String y = scan.next();
        System.out.println(sameASCII(x,y));
    }




    public static int oppositeHouse(int num, int street)
    {
        return Math.abs(num-1-street*2);

    }
    public static String nameShuffle(String fn, String ln )
    {
        return ln + " " + fn;
    }
    public static double discount(double price, double sale)
    {
        double n = sale / 100;
        double n1 = 1 - n;
        return price *= n1;

    }
    static double differenceMaxMin(double[] array)
    {
        double max = -9999;
        double min = 9999;
        for (int i = 0; i < array.length;i++ )
        {
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
        }
        return max - min;

    }
    static int equals(int a, int b, int c)
    {   int k = -1;
        if((a == b) && (b == c) && (c == a))
            k = 3;
        else if((a == b) && (b != c) && (c != a))
            k = 2;
        else if((b == c) && (a != c) && (a != b))
            k = 2;
        else if((a == c) && (b != c) && (b != a))
            k = 2;
        else if((a != b) & (b !=c) & (c != a))
            k = 0;
        return k;
    }
    static String reverse(String s)
    {
        String a = "";
        for (int i = s.length() - 1; i >= 0; --i)
            a += s.charAt(i);
        return a;
    }
    static int programmers(int sal1, int sal2, int sal3)
    {
        int max = sal1;

        if(sal2 > max)
            max = sal2;
        if(sal3 > max)
            max = sal3;

        int min = sal1;

        if (sal2 < min)
            min = sal2;
        if (sal3 < min)
            min = sal3;

    return max - min;
    }
    static boolean getOX(String str)
    {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'x') | (str.charAt(i) == 'X'))
                k1++;
            if ((str.charAt(i) == 'o') | (str.charAt(i) == 'O'))
                k2++;
        }
        if(k1 == k2)
            return true;
        else if((k1==0) && (k2 ==0))
            return true;
        else return false;
    }

    static String bomb(String stroka)
    {   int k = 0;
        stroka = stroka.toLowerCase();
          if(stroka.contains("bomb"))
             return "DUCK";
         else return "Relax";
    }

    public static boolean sameASCII(String s1, String s2)
    {
        if(s1.chars().sum() == s2.chars().sum())
            return true;
        else return false;
    }

    }



