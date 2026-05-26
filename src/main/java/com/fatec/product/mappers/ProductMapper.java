package com.fatec.product.mappers;

import com.fatec.product.dtos.ProductRequest;
import com.fatec.product.dtos.ProductResponse;
import com.fatec.product.entities.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequest request) {
        Product p = new Product();
        p.setName(request.name());
        p.setDescription(request.description());
        p.setPrice(request.price());

        return p;
    }

    public static ProductResponse toDTO(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice());

    }
}
