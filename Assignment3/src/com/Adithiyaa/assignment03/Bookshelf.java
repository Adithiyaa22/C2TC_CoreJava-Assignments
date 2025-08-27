package com.Adithiyaa.assignment03;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	 private List<Product> items;

	    public Bookshelf() {
	        items = new ArrayList<>();
	    }

	    public void addItem(Product item) {
	        items.add(item);
	    }

	    public void showAllItems() {
	        for (Product item : items) {
	            item.displayInfo();
	            System.out.println("-------------------");
	        }
	    }
}
