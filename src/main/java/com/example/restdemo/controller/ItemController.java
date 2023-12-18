package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.Service.ItemService;
import com.example.restdemo.model.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAItems();
    }
}
