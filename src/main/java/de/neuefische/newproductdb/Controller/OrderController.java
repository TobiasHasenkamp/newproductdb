package de.neuefische.newproductdb.Controller;

import de.neuefische.newproductdb.model.Order;
import de.neuefische.newproductdb.model.Product;
import de.neuefische.newproductdb.services.OrderService;
import de.neuefische.newproductdb.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> printList(){
        return orderService.getOrderList();
    }

    @PutMapping
    public Order addToTheList(@RequestBody Order order){
        return orderService.addProductToList(order);
    }
}
