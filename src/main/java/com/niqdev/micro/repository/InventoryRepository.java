package com.niqdev.micro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niqdev.micro.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	Optional<Inventory> findByProductCode(String productCode);
}
