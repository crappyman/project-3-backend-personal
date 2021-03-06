package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project3.revtech.entity.CartItemEntity;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemEntity, Integer>{

    boolean existsByCartIdAndProductId(int cartId, int productId);
	boolean existsByCartQtyIsLessThanAndCartIdAndProductId(int cartQty, int cartId, int productId);
    CartItemEntity findByCartIdAndProductId(int cartId, int productId);
	List<CartItemEntity> findAllByCartId(int cartId);
}
