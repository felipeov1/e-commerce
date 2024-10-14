package com.example.eletro_ecommerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/product")
    public String product() {
        return "product.html";
    }

    @GetMapping("/store")
    public String store() {
        return "store.html";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout.html";
    }

    @GetMapping("/blank")
    public String blank() {
        return "blank.html";
    }
}