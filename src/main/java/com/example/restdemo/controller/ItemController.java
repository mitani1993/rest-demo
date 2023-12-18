package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.Service.ItemService;
import com.example.restdemo.model.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAItems();
    }

    @GetMapping("/items/{itemId}")
    public Item getItem(@PathVariable String itemId) {
        return itemService.getItem(itemId);
    }

}
