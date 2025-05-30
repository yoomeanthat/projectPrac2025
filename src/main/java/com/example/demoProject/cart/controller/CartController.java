package com.example.demoProject.cart.controller;


import com.example.demoProject.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {


    @Autowired
    CartService service;

    @GetMapping("/cartList")
    public String cartList(Model model){
        List<String> list = service.getCartList();
        model.addAttribute("list", list);
        return "cartList";
    }
}
