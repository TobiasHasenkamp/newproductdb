package de.neuefische.newproductdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    String id;
    ArrayList<String> productsOfOrder;
}
