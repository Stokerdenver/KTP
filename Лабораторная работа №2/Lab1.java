package com.company;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args)
    {
        Point3d point1 = readPoints();
        Point3d point2 = readPoints();
        Point3d point3 = readPoints();

        if (point1.equals(point2))
            System.out.print("Точки №1 и №2 равны, площадь равна 0\n");
        else if (point2.equals(point3))
            System.out.print("Точки №2 и №3 равны, площадь равна 0\n");
        else if (point3.equals(point1))
            System.out.print("Точки №1 и №3 равны, площадь равна 0\n");
        else {

            // Вычисление площади и её вывод
            double area = computeArea(point1, point2, point3);
            System.out.printf("Площадь треугольника из трёх точек: %.4f\n", area);
        }
    }
    public static Point3d readPoints()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Х ");
        double x = scanner.nextDouble();

        System.out.print("Введите Y ");
        double y = scanner.nextDouble();

        System.out.print("Введите Z ");
        double z = scanner.nextDouble();

        return new Point3d(x, y, z);
    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){

        double a, b, c, p;

        a = p1.distanceTo(p2);
        b = p1.distanceTo(p3);
        c = p2.distanceTo(p3);

        p = (a + b + c) / 2;

        return Math.ceil(Math.sqrt(p * (p - a) * (p - b) * (p - c))*100)/100;
    }
}
