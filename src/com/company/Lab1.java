package com.company;

public class Lab1 {
    public static void main(String[] args){
        Point3d point3dOne = new Point3d(1.0, 2.0, 3.0);
        Point3d point3dTwo = new Point3d(2.0, 2.0, 4.0);
        Point3d point3dThree = new Point3d(1.0, 3.0, 5.0);
        System.out.println(point3dOne.compare(point3dTwo.getX(),point3dTwo.getY(),point3dTwo.getZ(),point));
        System.out.println(point3dOne.distanceTo(point3dTwo));

    }
    static double computeArea(){

    }
}
