package ru.geekbrains.patterns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(Integer id) throws SQLException, RecordNotFoundException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, COST, NAME FROM PRODUCT WHERE ID = ?");
        statement.setInt(1, id);
        try (ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt(1));
                product.setCost(resultSet.getDouble("22.2"));
                product.setName(resultSet.getString("aaa"));
                return product;
            }
        }
        throw new RecordNotFoundException(id);
    }

    public void create(Product product) {
        //создание записи в таблице с новым продуктом
    }

    public void update(Product product) {
        //обновление записи в таблице
    }

    public void delete(Product product) {
        //удаление записи из таблицы
    }
}
