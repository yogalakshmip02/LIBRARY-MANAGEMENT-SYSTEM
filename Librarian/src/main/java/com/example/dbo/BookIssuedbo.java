package com.example.dbo;

public class BookIssuedbo {

private Integer memberCode;
private Integer bookCode;
private String category;
private String bookName;
private String bookIssueOrNot;
public Integer getMemberCode() {
	return memberCode;
}
public void setMemberCode(Integer memberCode) {
	this.memberCode = memberCode;
}
public Integer getBookCode() {
	return bookCode;
}
public void setBookCode(Integer bookCode) {
	this.bookCode = bookCode;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookIssueOrNot() {
	return bookIssueOrNot;
}
public void setBookIssueOrNot(String bookIssueOrNot) {
	this.bookIssueOrNot = bookIssueOrNot;
}


}
