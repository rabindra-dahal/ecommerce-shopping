package com.shop.ecommerceshop.service;

import com.shop.ecommerceshop.model.Category;
import com.shop.ecommerceshop.model.Product;
import com.shop.ecommerceshop.repository.CategoryRepository;
import com.shop.ecommerceshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void removeProductById(Long id){
        productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    public List<Product> getAllProductsByCategory(int id){
        return productRepository.findAllByCategory_Id(id);
    }

}
