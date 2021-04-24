package com.company;

public class Main {

    public static void main(String[] args) {
        Point2d myPoint = new Point2d (5,3);
        Point2d myNewPoint = new Point2d (5,3);
        myNewPoint.compare(myNewPoint.getX(),myNewPoint.getY(), myPoint.getX(),myPoint.getY());
        if (myPoint == myNewPoint)
            System.out.println("пробил");
        else System.out.println("не пробил");


    }
}
