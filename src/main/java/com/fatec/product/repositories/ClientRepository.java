package com.fatec.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.product.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
