package com.user.catalog.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.catalog.entity.PurchasedProductEntity;
import com.user.catalog.model.PurchaseProductRequest;
import com.user.catalog.service.IUserProductService;
import com.user.catalog.service.repository.UserProductRepository;

@Component
public class UserProductServiceImpl implements IUserProductService {

	private Logger log = LoggerFactory.getLogger(UserProductServiceImpl.class);

	@Autowired
	private UserProductRepository userProductRepository;

	@Override
	public PurchasedProductEntity purchaseProduct(PurchaseProductRequest purchaseProductRequest) {
		log.debug("Entered method purchaseProduct");
		log.debug("Purchase request : {} ", purchaseProductRequest);
		
		PurchasedProductEntity product = userProductRepository.save(populatePurchasedProducts(purchaseProductRequest));
		return product;
	}

	@Override
	public List<PurchasedProductEntity> getAllProductsForUser(String userId) {
		log.debug("Entered method getAllProductsForUser");
		return userProductRepository.getUserProductsByUserId(Long.valueOf(userId));
	}

	private PurchasedProductEntity populatePurchasedProducts(PurchaseProductRequest purchaseProductRequest) {
		PurchasedProductEntity product = new PurchasedProductEntity();
		product.setProductId(Long.valueOf(purchaseProductRequest.getProductId()));
		product.setUserId(Long.valueOf(purchaseProductRequest.getUserId()));
		product.setCreatedDttm(new Timestamp(System.currentTimeMillis()));
		product.setPurchasedQuantity(Double.valueOf(purchaseProductRequest.getProductUnits()));

		return product;
	}

}
