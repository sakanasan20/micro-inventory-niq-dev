package com.niqdev.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niqdev.micro.entity.Inventory;
import com.niqdev.micro.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {
	private final InventoryRepository inventoryRepository;

	  @GetMapping("/check/{code}")
	  public Boolean isInStock(@PathVariable String code) {
	    return inventoryRepository.findByProductCode(code)
	        .map(i -> i.getQuantity() > 0)
	        .orElse(false);
	  }

	  @PostMapping
	  public Inventory save(@RequestBody Inventory inventory) {
	    return inventoryRepository.save(inventory);
	  }
	
}
