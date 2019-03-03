package com.cloud.product.service.impl;

import com.cloud.product.dataObject.ProductCategory;
import com.cloud.product.repository.ProductCategoryRepository;
import com.cloud.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
        return byCategoryTypeIn;
    }
}
