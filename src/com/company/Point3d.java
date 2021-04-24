package com.company;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    // Конструктор инициализации
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    // Конструктор по умолчанию
    public Point3d () {
        this(0,0,0);
    }
    // Возвращение координаты икс
    public double getX () {
        return xCoord;
    }
    // Возвращение координаты игрик
    public double getY(){
        return yCoord;
    }
    // Возвращение координаты зет
    public double getZ() {
        return zCoord;
    }
    // Установка значения координаты икс
    public void setX ( double val) {
        xCoord = val;
    }
    // Установка значения координаты игрик
    public void setY ( double val) {
        yCoord = val;
    }
    // Установка значения координаты зет
    public void setZ (double val) {
        zCoord = val;
    }
    public void compare (double x1, double y1, double z1, double x2, double y2, double z2){
        if((x1==x2) && (y1==y2) && (z1==z2))
            System.out.println("равны");
        else System.out.println("не равны");
    }
    public double distanceTo(Point3d point3d) {

        double distance;
        distance = Math.ceil(Math.sqrt(
                        Math.pow((point3d.xCoord-this.xCoord), 2)
                        +Math.pow((point3d.yCoord-this.yCoord), 2)
                        +Math.pow((point3d.zCoord-this.zCoord), 2))*100)/100;
        return distance;

    }
}
