package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Category {
@Id
private String Category;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="cust_id")
private List<Book> book;

public Category(String category, List<Book> book) {
	super();
	Category = category;
	this.book = book;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}

}
