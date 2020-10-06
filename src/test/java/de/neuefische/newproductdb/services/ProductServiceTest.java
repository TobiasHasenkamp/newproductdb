package de.neuefische.newproductdb.services;

import de.neuefische.newproductdb.db.ProductDB;
import de.neuefische.newproductdb.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    private final ProductDB productDBMock = mock(ProductDB.class);
    private final ProductService productService = new ProductService(productDBMock);

    @Test
    void testSearchFoundElements() {
        //GIVEN
        String testString = "o";
        when(productDBMock.getProductList())
                .thenReturn(List.of(new Product("1", "Toilettenpapier", "4€"),
                new Product("2", "Atemschutzmaske", "10€")));

        //WHEN
        List<Product> expectedProductList = productService.search(testString);

        //THEN
        assertThat(expectedProductList, containsInAnyOrder(new Product("1", "Toilettenpapier", "4€")));
    }

    @Test
    void testSearchFoundNoElements() {
        //GIVEN
        String testString = "x";
        when(productDBMock.getProductList())
                .thenReturn(List.of(new Product("1", "Toilettenpapier", "4€"),
                        new Product("2", "Atemschutzmaske", "10€")));

        //WHEN
        List<Product> expectedProductList = productService.search(testString);

        //THEN
        assertThat(expectedProductList, hasSize(0));
    }

    @Test
    void testAddProductToList() {
        //GIVEN
        when(productDBMock.addProduct(new Product("2", "Abstandsstab", " 20€")))
                .thenReturn(new Product("2", "Abstandsstab", " 20€"));

        //WHEN
        Product product = productService.addProductToList(new Product("2", "Abstandsstab", " 20€"));
        Product expectedProduct = new Product("2", "Abstandsstab", " 20€");
        //THEN
        assertThat(product, is(expectedProduct));
        verify(productDBMock).addProduct(expectedProduct);

    }

}