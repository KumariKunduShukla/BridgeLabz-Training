package com.generics.smartwarehousemanagement;

import java.util.List;
import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getAllItems() {
        return items;
    }
}
