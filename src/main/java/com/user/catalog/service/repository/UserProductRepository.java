package com.user.catalog.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.catalog.entity.PurchasedProductEntity;

public interface UserProductRepository extends CrudRepository<PurchasedProductEntity, Long> {

	@Query(name = "select * from UserProducts where user_id = :userId", nativeQuery = true)
	public List<PurchasedProductEntity> getUserProductsByUserId(@Param("userId") Long userId);
}
