package org.project.omwp.repository;

import org.project.omwp.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByProductType(String productType);

    List<ProductEntity> findByProductNameContaining(String search);

    @Query(value = " select p.* from product p where p.product_type = :product_type and p.product_name like '%:search%' ", nativeQuery = true)
    List<ProductEntity> findByProductTypeAndProductNameContaining(@Param("product_type") String productType, @Param("search") String search);

    List<ProductEntity> findByProductNameContainingAndProductTypeContaining(String search, String productType);

}
