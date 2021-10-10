package ru.geekbrains.patterns;

import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class IdentityMap {
    private static final Map<Integer, Product> hash = new HashMap<>();

    public static Product findById(Integer id) {
        return hash.get(id);
    }

    public static void add(Product product) {
        hash.put(product.getId(), product);
    }

    public static void deleted(Product product) {
        hash.remove(product.getId());
    }
}
