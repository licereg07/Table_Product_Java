package com.fatec.product.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest(

        @NotBlank(message = "Nome não pode ser em branco") String name,

        @Size(min = 4, max = 30, message = "Descrição não pode ser em branco") String description,

        @Min(value = 0, message = "Preço não pode ser negativo") Double price) {

}
