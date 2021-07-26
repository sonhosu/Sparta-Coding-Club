package com.sparta.week04practice.controller;

import com.sparta.week04practice.model.Product;
import com.sparta.week04practice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class ProductRestController {

   private final ProductRepository repository;

    @GetMapping("/api/porudcts")
    public List<Product> getproducts(){

     return repository.findAll();

    }


}
