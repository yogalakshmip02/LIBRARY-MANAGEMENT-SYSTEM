package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
private Integer bookId;
@Id
private String bookName;

public Book(Integer bookId, String bookName) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
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
