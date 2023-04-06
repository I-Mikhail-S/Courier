package org.example.point;

public class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        if(PointBuilder.pointIsValid(X,Y)) {
            X = x;
            Y = y;
        }
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        if(PointBuilder.pointIsValid(Y)) {
            this.X = X;
        }
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        if(PointBuilder.pointIsValid(Y)) {
           this.Y = Y;
        }
    }
    public  double distancePoint(double x,double y){
        if (x != getX() && Y != getY()) {
            return (double) Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2));
        }
        throw new RuntimeException("Проверить точки");
    }
    public double distancePoint(Point z) {
        if (z.getX() != getX() && z.getY() != getY()) {
            return Math.sqrt(Math.pow((z.getX() - getX()), 2) + Math.pow((z.getY() - getY()), 2));
        }
        throw new RuntimeException("Проверить точки");
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
