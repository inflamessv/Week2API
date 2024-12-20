package com.api.week2.Week2API.controller;

import com.api.week2.Week2API.model.Product;
import com.api.week2.Week2API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    public ResponseEntity<?>saveProduct(@RequestBody Product prod){
        try{
            service.add(prod);
            return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully");
        }catch (RuntimeException ex){
            throw new RuntimeException("Product could not be saved:"+ex.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<List<Product>>findProducts(){
        try{
            List<Product>products = service.getAll();
            return ResponseEntity.status(HttpStatus.OK).body(products);
        }catch (RuntimeException ex){
            throw new RuntimeException("Product could not be listed:"+ex.getMessage());
        }
    }

    @GetMapping("/category/{catId}")
    public ResponseEntity<List<Product>>findProductsByCategory(@PathVariable Long id){
        try{
            if(id == null){
                throw new IllegalArgumentException("id can not be empty");
            }
            List<Product>products = service.findByCategoryId(id);
            return ResponseEntity.status(HttpStatus.OK).body(products);
        }catch (RuntimeException ex){
            throw new RuntimeException("Product could not be listed:"+ex.getMessage());
        }
    }

    @GetMapping("name/{name}")
    public ResponseEntity<List<Product>>findProductByName(@PathVariable String name){
        try{
            if(name == null || name.equals("")){
                throw new IllegalArgumentException("id can not be empty");
            }
            List<Product>products = service.findByName(name);
            return ResponseEntity.status(HttpStatus.OK).body(products);
        }catch (RuntimeException ex){
            throw new RuntimeException("Product could not be listed:"+ex.getMessage());
        }
    }

    @GetMapping("/paginated")
    public Page<Product> getPaginatedProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam() String direction){
        return service.findAll(page, size,sort,direction);
    }

}
