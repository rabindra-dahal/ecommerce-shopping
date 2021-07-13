package com.shop.ecommerceshop.repository;

import com.shop.ecommerceshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
