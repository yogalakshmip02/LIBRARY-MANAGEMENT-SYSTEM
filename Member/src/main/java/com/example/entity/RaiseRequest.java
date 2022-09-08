package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RaiseRequest {
@Id
private Integer memberCode;
private String bookName;
private String category;
private String description;

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Integer getMemberCode() {
	return memberCode;
}
public void setMemberCode(Integer memberCode) {
	this.memberCode = memberCode;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


}
