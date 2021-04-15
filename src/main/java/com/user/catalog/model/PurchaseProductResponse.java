package com.user.catalog.model;

import java.util.List;

import com.user.catalog.entity.PurchasedProductEntity;

public class PurchaseProductResponse {

	private String userId;
	private List<PurchasedProductEntity> products;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<PurchasedProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<PurchasedProductEntity> products) {
		this.products = products;
	}
}
