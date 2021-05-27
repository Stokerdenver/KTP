package com.company;

public class Point2d {
    private double xCoord;
    private double yCoord;
    // конструктор инициализации
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    // конструктор по умолчанию
    public Point2d () {
        this(0,0);
    }
    // возвращение координаты икс
    public double getX () {
        return xCoord;
    }
    // возвращение координаты игрик
    public double getY () {
        return yCoord;
    }
    // установка значения координаты икс
    public void setX ( double val) {
        xCoord = val;
    }
    // установка значения координаты игрик
    public void setY ( double val) {
        yCoord = val;
    }
    // // Метод для сравнения значений двух объектов Point2d
    public void compare (double x1, double y1, double x2, double y2){
        if((x1==x2) && (y1==y2))
            System.out.println("равны");
        else System.out.println("не равны");
    }

}
