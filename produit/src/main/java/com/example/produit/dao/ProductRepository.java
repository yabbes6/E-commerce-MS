package com.example.produit.dao;

import com.example.produit.mapper.ProductMapper;
import com.example.produit.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Integer> {
    public List<ProductMapper> getAllProduct();

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status,@Param("id") int id);

    List<ProductMapper> getProductByCategory(@Param(("id")) Integer id);

    ProductMapper getProductById(@Param("id") Integer id);
}
