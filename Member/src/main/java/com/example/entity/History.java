package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class History {
@Id
private Integer bookCode;
private String categoryName;
private String bookName;
public Integer getBookCode() {
	return bookCode;
}
public void setBookCode(Integer bookCode) {
	this.bookCode = bookCode;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}


}
