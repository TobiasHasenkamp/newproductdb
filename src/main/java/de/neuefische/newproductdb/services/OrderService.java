package de.neuefische.newproductdb.services;

import de.neuefische.newproductdb.db.OrderDB;
import de.neuefische.newproductdb.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderDB orderDB;

    public OrderService(OrderDB orderDB) {
        this.orderDB = orderDB;
    }

    public Order addProductToList(Order order) {
        return orderDB.addOrder(order);
    }

    public List<Order> getOrderList() {
        return orderDB.getOrderList();
    }

}
