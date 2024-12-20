package com.api.week2.Week2API.service;

import com.api.week2.Week2API.model.Product;
import com.api.week2.Week2API.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService<Product,Long>{
    @Autowired
    private IProductRepository repository;

    @Override
    public List<Product> getAll() {
        try{
           return repository.findAll();
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public void add(Product product) {
        try{
            repository.save(product);
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public List<Product> findByCategoryId(Long categoryId) {
        try{
            return repository.findByCategoryId(categoryId);
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public List<Product> findByName(String name) {
        try{
            return repository.findByName(name);
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Page<Product> findAll(int page, int size, String sort,String direction) {
        try{
            Sort sortDirection = "desc".equalsIgnoreCase(direction)
                    ? Sort.by(Sort.Order.desc(sort))
                    : Sort.by(Sort.Order.asc(sort));


            return repository.findAll(PageRequest.of(page, size, sortDirection));
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }


}
