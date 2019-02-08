package com.johnlewis.repository;

import java.util.List;

import com.johnlewis.domain.Product;

public interface DiscountRepository {
	
	List<Product> getDiscountedProducts(Integer categoryId);

}
