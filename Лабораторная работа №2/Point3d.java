package com.company;

public class  Point3d extends Point2d {

    private double zCoord;

    // Конструктор инициализации
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    // Конструктор по умолчанию
    public Point3d() {
        this(0, 0, 0);
    }


    // Возвращение координаты зет
    public double getZ() {
        return zCoord;
    }


    // Установка значения координаты зет
    public void setZ(double val) {
        zCoord = val;
    }
    // Сравнение двух объектов - равенство по координатам точки
    public boolean equals(Point3d point) {
        return (this.getX() == point.getX() && this.getY() == point.getY() && this.getZ() == point.getZ());
    }

    // Метод для сравнения значений двух объектов Point3d
    public void compare(double x1, double y1, double z1, double x2, double y2, double z2) {
        if ((x1 == x2) && (y1 == y2) && (z1 == z2))
            System.out.println("Одна из точек равна другой");

    }
    public double distanceTo(Point3d point) {
        double dx = Math.abs(this.getX() - point.getX());
        double dy = Math.abs(this.getY() - point.getY());
        double dz = Math.abs(this.getZ() - point.getZ());
        double distance = Math.sqrt(dx*dx+dy*dy+dz*dz);
        return distance;
    }
   /* public double distanceTo(Point3d point3d) {

        double distance;
        distance = Math.ceil(Math.sqrt(Math.pow((point3d.getX() - this.getX()), 2) + Math.pow((point3d.getY() - this.getY()), 2) + Math.pow((point3d.getZ() - this.getZ()), 2)) * 100) / 100;

        return distance;

    }

    */
}
