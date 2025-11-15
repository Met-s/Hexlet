package io.hexlet.module.implemeentations_47;

import io.hexlet.module.Good_47;

import java.util.List;
import java.util.Map;

public interface Cart {
    void addItem(Good_47 item, int count);
    List<Map> getItems();
    int getCost();
    int getCount();
}
