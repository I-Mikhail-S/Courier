package org.example.order;

import org.example.point.Point;
import org.example.point.PointBuilder;
// TODO: 08/04/2023
public class Order {
    private int id;

    //private Courier? courier;

    //Eсли что-то не так, то исправляйте, пожалуйста

    private Point a;

    private Point b;

    private double distance;

    private double timeInterval;

    private EnumOrder weight;


    public Order(){

    }
    public Order(int id, Point a, Point b, double distance, double timeInterval) {
        //Я думаю, что тут нужна проверка на актуальность, но я не уверен, как вы её делаете
        //courier = courier;
        this.id = id;
        this.a = a;
        this.b = b;
        this.distance = distance;
        this.timeInterval = timeInterval;
    }


    /*

    public Courier? getCourier() {
    return courier;
    }
    public void setCourier(Courier? courier){
    this.courier = courier
    }

    */
    public EnumOrder getWeight() {
        return weight;
    }

    public void setWeight(EnumOrder weight) {
        this.weight = weight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(double timeInterval) {
        this.timeInterval = timeInterval;
    }
}
