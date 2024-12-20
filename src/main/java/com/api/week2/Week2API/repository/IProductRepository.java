package com.api.week2.Week2API.repository;

import com.api.week2.Week2API.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(Double price);
    @Query("SELECT p FROM Product p WHERE p.price > :price")
    List<Product> findProductsExpensiveThan(@Param("price") Double price);
    Page<Product> findAll(Pageable pageable);

}
