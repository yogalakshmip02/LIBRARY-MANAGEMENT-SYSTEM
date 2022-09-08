package com.example.dbo;

import java.util.List;

import com.example.entity.Book;

public class Categorydbo {
	private String Category;
	private List<Bookdbo> book;
	public String getCategory() {
		return Category;
	}
	
	

	public void setCategory(String category) {
		Category = category;
	}
	public List<Bookdbo> getBook() {
		return book;
	}
	public void setBook(List<Bookdbo> book) {
		this.book = book;
	}
//	public Categorydbo getCategorydetails(String categoryName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
}
