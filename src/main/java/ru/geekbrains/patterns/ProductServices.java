package ru.geekbrains.patterns;

import java.sql.Connection;
import java.sql.SQLException;

public class ProductServices {

    private Connection connection;
    ProductMapper productMapper = new ProductMapper(connection);

    Product product;

    {
        try {
            product = productMapper.findById(1);
        } catch (SQLException | RecordNotFoundException e) {
            e.printStackTrace();
        }
    }
}
