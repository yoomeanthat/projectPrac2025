package com.example.demoProject.cart.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Override
    public List<String> getCartList() {

        // List<String> list = new ArrayList<>(); list.add("양말"); list.add("샌달");
        return List.of("바지","티셔츠","샌달");
    }
}
