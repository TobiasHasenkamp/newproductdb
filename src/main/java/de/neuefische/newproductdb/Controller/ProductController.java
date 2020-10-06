package de.neuefische.newproductdb.Controller;

import de.neuefische.newproductdb.db.ProductDB;
import de.neuefische.newproductdb.model.Product;
import de.neuefische.newproductdb.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> printList(){
        return productService.getProductList();
    }

    @PutMapping
    public Product addToTheList(@RequestBody Product product){
        return productService.addProductToList(product);
    }
}
