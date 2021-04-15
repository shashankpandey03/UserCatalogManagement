package com.user.catalog.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "UserProducts")
public class PurchasedProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_product_id")
	private Long userProductId;

	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "PRODUCT_ID")
	private Long productId;

	@Column(name = "purchased_quantity")
	private Double purchasedQuantity;

	@Column(name = "created_dttm")
	private Timestamp createdDttm;

	public Long getUserProductId() {
		return userProductId;
	}

	public void setUserProductId(Long userProductId) {
		this.userProductId = userProductId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Timestamp getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(Timestamp createdDttm) {
		this.createdDttm = createdDttm;
	}

	public Double getPurchasedQuantity() {
		return purchasedQuantity;
	}

	public void setPurchasedQuantity(Double purchasedQuantity) {
		this.purchasedQuantity = purchasedQuantity;
	}
}
