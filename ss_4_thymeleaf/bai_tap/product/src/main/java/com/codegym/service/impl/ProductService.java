package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll(String name) {
        return iProductRepository.findAll(name);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }
}
