package com.Adithiyaa.assignment03;

public class Volume extends Product {
	String author;

    public Volume(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}
