package com.fatec.product.dtos;

public record ProductResponse(

        Long id,
        String name,
        String description,
        Double price) {

}
