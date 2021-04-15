package com.user.catalog.service;

import java.util.List;

import com.user.catalog.entity.PurchasedProductEntity;
import com.user.catalog.model.PurchaseProductRequest;

public interface IUserProductService {
	
	PurchasedProductEntity purchaseProduct(PurchaseProductRequest purchaseProductRequest);
	List<PurchasedProductEntity> getAllProductsForUser(String userId);
}
