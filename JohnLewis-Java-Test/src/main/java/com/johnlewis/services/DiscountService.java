package com.johnlewis.services;

import java.util.List;
import java.util.Optional;

import com.johnlewis.model.LabelTypeEnum;
import com.johnlewis.model.ProductModel;

public interface DiscountService {
	
	
	List<ProductModel> getDiscountedProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType);

	
}