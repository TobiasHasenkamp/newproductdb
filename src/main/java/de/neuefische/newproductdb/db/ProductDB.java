package de.neuefische.newproductdb.db;

import de.neuefische.newproductdb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDB{

    private final List<Product> productList = new ArrayList(List.of(
            new Product("1", "Toilettenpapier", "4€"),
            new Product("2", "Atemschutzmaske", "5€")
    ));

    public List<Product> getProductList(){
        return this.productList;
    }

    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }

}
