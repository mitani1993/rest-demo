package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.Service.ItemService;
import com.example.restdemo.model.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

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

    @PostMapping("/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("items/{itemId}")
    public void updateItem(@PathVariable String itemId, @RequestBody Item item) {
        itemService.updateItem(itemId, item);
    }

    @DeleteMapping("items/{itemId}")
    public void deleteItem(@PathVariable String itemId) {
        itemService.deleteItem(itemId);
    }
}
