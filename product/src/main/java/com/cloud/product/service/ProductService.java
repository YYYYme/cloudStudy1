package com.cloud.product.service;

import com.cloud.product.dataObject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有上架商品
     * @return
     */
    List<ProductInfo> findUpAll();
}
