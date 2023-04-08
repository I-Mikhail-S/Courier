package org.example.fabricOrder;

import org.example.order.EnumOrder;
import org.example.order.Order;
import org.example.point.Point;

public class BuilderOrder {
    Order order;

    public BuilderOrder(EnumOrder type) throws Exception {
        order = new Factory().getNewOrder(type);
    }

    public BuilderOrder id (int id) {
        order.setId(id);
        return this;
    }

    public BuilderOrder start (Point start) {
        order.setStart(start);
        return this;
    }

    public BuilderOrder finish (Point finish) {
        order.setFinish(finish);
        return this;
    }

    //public BuilderOrder

    private class Factory {
        Order getNewOrder(EnumOrder enumOrder) throws Exception {
            Order order = null;

            switch (enumOrder) {
                case LIGHT:
                    order.setWeight(EnumOrder.LIGHT);
                    break;
                case MEDIUM:
                    order.setWeight(EnumOrder.MEDIUM);
                    break;
                case HARD:
                    order.setWeight(EnumOrder.HARD);
                    break;
                default:
                    throw new Exception("Invalid order type!");
            }
            return order;
        }
    }
}