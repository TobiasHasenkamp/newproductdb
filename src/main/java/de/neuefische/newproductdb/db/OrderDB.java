package de.neuefische.newproductdb.db;

import de.neuefische.newproductdb.model.Order;
import de.neuefische.newproductdb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDB {

    private final List<Order> orderList = new ArrayList<>(List.of(
            new Order("1", new ArrayList<>(List.of("1", "2")))));


    public List<Order> getOrderList(){
        return this.orderList;
    }

    public Order addOrder(Order order) {
        orderList.add(order);
        return order;
    }
}
