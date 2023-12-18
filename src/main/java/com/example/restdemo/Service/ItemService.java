package com.example.restdemo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restdemo.model.Item;

@Service
public class ItemService {

    private List<Item> allItems = new ArrayList<>(Arrays.asList(
            new Item("10001", "ネックレス", "ジュエリ"),
            new Item("10002", "パーカー", "ファッション"),
            new Item("10003", "フェイスクリーム", "ビューティー"),
            new Item("10004", "サプリメント", "ヘルス"),
            new Item("10005", "ブルーベリー", "フード")));

    public List<Item> getAItems() {
        return allItems;
    }

    public Item getItem(String itemId) {
        for (Item item : allItems) {
            if (item.getItemId().equals(itemId))
                return item;
        }
        return null;
    }

    public void addItem(Item item) {
        allItems.add(item);
    }
}
