                                                            LIBRARY-MANAGEMENT-SYSTEM 
                                                  
                                                                          
                                                                          This assignment is developed by using Microservices. Library management system provides online real time information about the books available in Library. It is capable of managing book issues and returns. Librarian will act as the administrator to control members and manage books. The member’s status of issue/return is maintained in the library database. Members will be able to check the availability of books in different categories. Member’s details and book details can be fetched by the librarian when required. 
                                                                          
 In this assignment, we have two microservices such as Librarian, Member.
 1. Librarian
 
 # Rest API
we are using RestApi to add,view,update the data for librarian

*  RegisterAPI :
In this api, we Can register a member
#http://localhost:8077/library/member
#http://localhost:8077/library/members/1
#http://localhost:8077/library//memberdelete/2

*  BookStatusAPI
In this api, we Can check the current status of books and Add/edit books and their information to the database
http://localhost:8077/library/update/2
http://localhost:8077/library/book
http://localhost:8077/library/books/5

*  CategoryBookAPI:
we Can view the different categories of books available in the library and we Can view the list of books available in each category
http://localhost:8077/library/bookscategory/MBA

*  BookIssueAPI
In this api, we Can issue a book to the member
http://localhost:8077/library/issue

*  ReportsAPI
In this api, we can see the reports of issued and returned books
http://localhost:8077/library/code

# SWAGGER-API
we are using the swagger-api for Librarian
http://localhost:8077/swagger-ui.html

# H2 DATABASE

we are store the data in h2 database
http://localhost:8077/h2
we have 6 tables for library![Screenshot (85)](https://user-images.githubusercontent.com/113039639/188908425-9dbb1e47-96a0-4344-8702-662d3b2b1c78.png)

# API-GATEWAY 
http://localhost:9192/library/

2. Member

# Rest API
we are using RestApi to add,view,update the data for Member

*  CategoryBookAPI:
In this api, we Can view the different categories of books available in the library and we Can view the list of books available in each category

http://localhost:8072/member/bookscategory/{CategoryName}

*  BookStatusAPI :
In this api, we Can check the current status of the books

http://localhost:8072/member/book
http://localhost:8072/member/books/110

*  BookAssignedAPI :
In this api, we Can view the books assigned to him.

http://localhost:8072/member/books/6

*  RaiseRequestAPI:

Can raise a new request for an available book
http://localhost:8072/member/books/10

*  HistoryAPI:
In this api, Can view the history of books issued to him previously
http://localhost:8072/member/history

# SWAGGER-API
we are using the swagger-api for Librarian
http://localhost:8072/swagger-ui.html

#H2 Database
we are store the data in h2 database
http://localhost:8072/h2
we have 6 tables for member

![Screenshot (87)](https://user-images.githubusercontent.com/113039639/188909762-83f6b017-7e56-4f3c-a6da-a525132318f5.png)

#API GATEWAY
http://localhost:9192/member/

#EUREKA SERVER
 we are registering the librarian and member microservices into eureka server

http://localhost:8720

![Screenshot (88)](https://user-images.githubusercontent.com/113039639/188912076-7678593c-f491-4751-9f7a-62136af0996c.png)
![Screenshot (89)](https://user-images.githubusercontent.com/113039639/188912150-b223a85f-0fac-410f-bf32-d5407e5a3d92.png)
![Screenshot (90)](https://user-images.githubusercontent.com/113039639/188912230-afc408b1-f257-4bff-99ac-eecc0dd43f2e.png)


