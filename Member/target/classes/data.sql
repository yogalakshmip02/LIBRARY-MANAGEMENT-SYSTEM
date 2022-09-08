


CREATE TABLE BookAssigned(memberCode INTEGER,bookCode INTEGER,category VARCHAR(5),
bookName VARCHAR(50),bookIssueOrNot VARCHAR(10),
primary key(memberCode));


INSERT INTO BookAssigned(memberCode,bookCode,category,bookName,bookIssueOrNot)
VALUES(2,101,'bca','c++','yes');

INSERT INTO BookAssigned(memberCode,bookCode,Category,bookName,bookIssueOrNot)
VALUES(6,109,'BCA','java','no');

	
CREATE TABLE BookStatus(bookCode INTEGER,category VARCHAR(20),name VARCHAR(30),
description VARCHAR(50),total INTEGER,availability INTEGER,
primary key(bookCode));

INSERT INTO BookStatus (bookCode,category,name,description,total,availability)
VALUES(110,'BCA','java','author-balagurusamy',20,10);

INSERT INTO BookStatus (bookCode,category,name,description,total,availability)
VALUES(111,'MBA','hr','author-sasha',10,10);


CREATE TABLE History(bookCode INTEGER,categoryName VARCHAR(10),bookName VARCHAR(40),
primary key(bookCode));

INSERT INTO History(bookCode,categoryName,bookName) VALUES (97,'MBA','organisational behaviour'); 
INSERT INTO History(bookCode,categoryName,bookName) VALUES (92,'MBA','Economics');	
	
	
	
	
CREATE TABLE Category(Category VARCHAR(20),
constraint customer_pk primary key (Category));

INSERT INTO Category(Category) VALUES ('MBA');

CREATE TABLE Book(bookId INTEGER,bookName VARCHAR(30),cid VARCHAR(30),
constraint card_pk primary key (bookId),
  constraint fk_card_cust foreign key (cid) references Category(Category));

INSERT INTO Book(bookId,bookName,cid) VALUES (10,'statistics','MBA');




CREATE TABLE RaiseRequest(memberCode INTEGER,bookName VARCHAR(30),
category VARCHAR(30),description VARCHAR(60), primary key(memberCode));

INSERT INTO RaiseRequest VALUES(10,'python','IT','author-karthiga');
	
	
	
	
	
	
	
	
	
	
	
	
	