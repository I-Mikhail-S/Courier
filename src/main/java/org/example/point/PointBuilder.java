package org.example.point;

public class PointBuilder {
    public static boolean pointIsValid(double x, double y) throws Exception {
        try {
            return (x >= 0) && (y >= 0)&&(x <= 100) && (y <= 100);
        }
        catch (Exception e){
            throw new Exception("Не коректные точки");
        }
    }
    public static boolean pointIsValid(double a) throws Exception {
        try {
            return (a >= 0) && (a <= 100) ;
        }
        catch (Exception e){
            throw new Exception("Не коректные точки");
        }
    }
}
