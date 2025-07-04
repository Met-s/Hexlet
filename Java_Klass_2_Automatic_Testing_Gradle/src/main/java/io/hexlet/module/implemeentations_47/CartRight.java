package io.hexlet.module.implemeentations_47;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import io.hexlet.module.Good_47;


public final class CartRight implements Cart {
    private List<Map> items = new ArrayList<>();

    public void addItem(Good_47 item, int count) {
        items.add(Map.of(
                "good", item,
                "count", count
        ));
    }

    public List<Map> getItems() {
        return items;
    }

    public int getCost() {
        return items
                .stream()
                .mapToInt(item -> {
                    Good_47 good = (Good_47) item.get("good");
                    return good.getPrice() * (int) item.get("count");
                })
                .sum();
    }

    public int getCount() {
        return items
                .stream()
                .mapToInt(item -> (int) item.get("count"))
                .sum();
    }
}

