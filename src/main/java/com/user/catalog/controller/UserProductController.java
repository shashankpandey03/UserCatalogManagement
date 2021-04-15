package com.user.catalog.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.catalog.entity.PurchasedProductEntity;
import com.user.catalog.model.PurchaseProductRequest;
import com.user.catalog.service.IUserProductService;

@RestController
public class UserProductController {

	private Logger log = LoggerFactory.getLogger(UserProductController.class);

	@Autowired
	private IUserProductService userProductService;

	@PostMapping("/users/{userId}/products")
	public ResponseEntity<PurchasedProductEntity> purchaseProduct(
			@Valid @RequestBody PurchaseProductRequest purchaseProductRequest, @PathVariable("userId") String id) {
		log.debug("Entered method purchaseProduct");

		PurchasedProductEntity product = null;
		try {
			product = userProductService.purchaseProduct(purchaseProductRequest);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}

	@GetMapping("/users/{userId}/products")
	public ResponseEntity<List<PurchasedProductEntity>> getAllProducts(@PathVariable("userId") String userId) {
		log.debug("Entered method purchaseProduct");

		List<PurchasedProductEntity> products = null;
		try {
			products = userProductService.getAllProductsForUser(userId);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(products, HttpStatus.CREATED);
	}
}
