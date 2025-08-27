package com.Adithiyaa.assignment03;

public class Main {

	public static void main(String[] args) {
  // Part A – Inheritance
        
    	Volume vol1 = new Volume(1, "Java Programming", "James Gosling");
        Journal jol1 = new Journal(2, "Tech Today", 45);

        System.out.println("=== Part A: Inheritance ===");
        vol1.displayInfo();
        System.out.println("-------------------");
        jol1.displayInfo();

        // Part B – Composition
        Bookshelf shelf = new Bookshelf();
        shelf.addItem(vol1);
        shelf.addItem(jol1);

        System.out.println("\n=== Part B: Composition ===");
        shelf.showAllItems();

	}

}
