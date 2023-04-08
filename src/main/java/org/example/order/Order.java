package org.example.order;

import org.example.point.Point;
import org.example.time.Time;

// TODO: 08/04/2023
public class Order {
    private int id;
    private Point start;
    private Point finish;
    //private double distance;
    private Time timeStart;
    private Time timeFinish;
    private EnumOrder weight;

    //private Courier? courier;

    public Order() {}

    public Order(int id, Point start, Point finish, Time timeStart, Time timeFinish, EnumOrder weight) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.weight = weight;
    }

//Я думаю, что тут нужна проверка на актуальность, но я не уверен, как вы её делаете
        //courier = courier;


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

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

}
