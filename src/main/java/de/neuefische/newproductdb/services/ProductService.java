package de.neuefische.newproductdb.services;

import de.neuefische.newproductdb.db.ProductDB;
import de.neuefische.newproductdb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDB productDB;

    public ProductService(ProductDB productDB) {
        this.productDB = productDB;
    }

    public List<Product> getProductList() {
        return productDB.getProductList();
    }

    public Product addProductToList(Product product){
        return productDB.addProduct(product);
    }
}
