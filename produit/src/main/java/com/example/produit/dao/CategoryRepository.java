package com.example.produit.dao;

import com.example.produit.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    List<Category> getAllCategory();
}
