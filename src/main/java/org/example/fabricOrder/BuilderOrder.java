package org.example.fabricOrder;

import org.example.order.EnumOrder;
import org.example.order.Order;

public class BuilderOrder {

    Order order;




    private class Factory {
        Order getParameterOrder(EnumOrder enumOrder) throws Exception {
            Order order = new Order();

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