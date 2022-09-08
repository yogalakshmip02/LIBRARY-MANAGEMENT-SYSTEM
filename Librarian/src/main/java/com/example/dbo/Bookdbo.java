package com.example.dbo;

import javax.persistence.Id;

public class Bookdbo {
	private Integer bookId;
	
	private String bookName;

	public Bookdbo(Integer bookId2, String bookName2) {
		// TODO Auto-generated constructor stub
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
