CREATE TABLE Registration (
    MemberCode INTEGER,
	Name VARCHAR(20),
	EmailId VARCHAR(30) ,
	MobileNo VARCHAR(20),
	DOB VARCHAR(40),
	primary key(MemberCode)
	);
	
insert into Registration(MemberCode,Name,EmailId,MobileNo,DOB) values (1,'YOGA', 'YOGA@GMAIL.COM', '9878674534','29-11-2000');
insert into Registration(MemberCode,Name,EmailId,MobileNo,DOB) values (2,'YOGI', 'YOG101@GMAIL.COM', '9864568534','11-11-2000');





CREATE TABLE BookIssue(memberCode INTEGER,
bookCode INTEGER,
category VARCHAR(20),
bookName VARCHAR(20),
bookIssueOrNot VARCHAR(10),
primary key(bookCode));



INSERT INTO BookIssue(memberCode,bookCode,category,bookName,bookIssueOrNot) values (3,1,'MBA','statistics','yes');

CREATE TABLE BookStatus(bookCode INTEGER,category VARCHAR(30),name VARCHAR(20),
description VARCHAR(70),total INTEGER, 
availability INTEGER,
primary key(bookCode));

INSERT INTO BookStatus(bookCode,category,name,description,total,availability) values (1,'programming','c++','basic c++',10,9);

CREATE TABLE Reports(memberCode INTEGER, bookCode INTEGER, issueDate VARCHAR(10),
returnDate VARCHAR(20),name VARCHAR(40),
bookName VARCHAR(50), primary key(memberCode));

INSERT INTO Reports (memberCode,bookCode,issueDate,returnDate,name,bookName) values (4,7,'1-9-2022','9-9-2022','sasha','HR');

CREATE TABLE Category(Category VARCHAR(20),
constraint customer_pk primary key (Category));

INSERT INTO Category(Category) VALUES ('MBA');

CREATE TABLE Book(bookId INTEGER,bookName VARCHAR(30),cid VARCHAR(30),
constraint card_pk primary key (bookId),
  constraint fk_card_cust foreign key (cid) references Category(Category));

INSERT INTO Book(bookId,bookName,cid) VALUES (10,'statistics','MBA');
