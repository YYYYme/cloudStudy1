package com.cloud.product.repository;

import com.cloud.product.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 类目
 */
//Integer为主键类型
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 查询类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
