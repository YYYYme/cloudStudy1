package com.cloud.product.service;

import com.cloud.product.dataObject.ProductCategory;

import java.util.List;

public interface CategoryService {

    /**
     * 查询类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
