package com.api.week2.Week2API.service;

import com.api.week2.Week2API.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService  <T,ID>{

    List<T> getAll();
    void add(T t);
    List<T>findByCategoryId(ID id);
    List<T>findByName(String name);
    Page<T> findAll(int page, int size, String sortBy,String direction);
}
