package com.example.dbo;

public class Reportsdbo {
	private Integer memberCode;
	private Integer bookCode;
	private String issueDate;
	private String returnDate;
	private String name;
	private String bookName;
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
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
