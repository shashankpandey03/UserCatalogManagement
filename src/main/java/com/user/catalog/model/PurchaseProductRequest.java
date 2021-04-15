package com.user.catalog.model;

import javax.validation.constraints.NotNull;

public class PurchaseProductRequest {

	@NotNull
	private String userId;
	
	@NotNull
	private String productId;
	
	@NotNull
	private Double productUnits;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getProductUnits() {
		return productUnits;
	}

	public void setProductUnits(Double productUnits) {
		this.productUnits = productUnits;
	}

	@Override
	public String toString() {
		return "PurchaseProductRequest [userId=" + userId + ", productId=" + productId + ", productUnits="
				+ productUnits + "]";
	}

}
