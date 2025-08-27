package com.Adithiyaa.assignment03;

public class Journal extends Product {
	
	private int issueNumber;

    public Journal(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine [ID: " + getId() + ", Title: " + getTitle() + ", Issue: " + issueNumber + "]");
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
