package com.Adithiyaa.assignment03;

public class Product {
	 private int id;
	    private String title;

	    public Product(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void displayInfo() {
	        System.out.println("Item [ID: " + id + ", Title: " + title + "]");
	    }
}
