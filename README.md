# LIBRARY-MANAGEMENT-SYSTEM
<br>                                             
* This assignment is developed by using Microservices.
<br> 
* Library management system provides online real time information about the books available in Library. 
<br>
* It is capable of managing book issues and returns. 
<br>
* Librarian will act as the administrator to control members and manage books. 
<br>
* The member’s status of issue/return is maintained in the library database.
<br>
* Members will be able to check the availability of books in different categories. 
<br>
* Member’s details and book details can be fetched by the librarian when required.
<br>
                                                                          
 In this assignment, we have two microservices such as Librarian, Member.
 <br>
 # 1. Librarian
<br>
# Rest API
<br>
we are using RestApi to add,view,update the data for librarian
<br>
* RegisterAPI :
<br>
In this api, we Can register a member
http://localhost:8077/library/member
<br>
http://localhost:8077/library/members/1
<br>
http://localhost:8077/library//memberdelete/2
<br>
* BookStatusAPI
<br>
In this api, we Can check the current status of books and Add/edit books and their information to the database
<br>
http://localhost:8077/library/update/2
<br>
http://localhost:8077/library/book
<br>
http://localhost:8077/library/books/5

* CategoryBookAPI:
  <br>
we Can view the different categories of books available in the library and we Can view the list of books available in each category
<br>
http://localhost:8077/library/bookscategory/MBA
<br>
* BookIssueAPI:
 <br>
In this api, we Can issue a book to the member
<br>
http://localhost:8077/library/issue
<br>
* ReportsAPI
<br>
In this api, we can see the reports of issued and returned books
<br>
http://localhost:8077/library/code
<br>
# SWAGGER-API
<br>
we are using the swagger-api for Librarian
<br>
http://localhost:8077/swagger-ui.html
<br>

# H2 DATABASE
<br>

we are store the data in h2 database
<br>
http://localhost:8077/h2
<br>
we have 6 tables for library
<br>
![Screenshot (85)](https://user-images.githubusercontent.com/113039639/188908425-9dbb1e47-96a0-4344-8702-662d3b2b1c78.png)
<br>
# API-GATEWAY 
<br>
http://localhost:9192/library/
<br>
# 2. Member
<br>
# Rest API
<br>
we are using RestApi to add,view,update the data for Member
<br>
* CategoryBookAPI:
<br>
In this api, we Can view the different categories of books available in the library and we Can view the list of books available in each category
<br>
http://localhost:8072/member/bookscategory/{CategoryName}
<br>
* BookStatusAPI :
<br>
In this api, we Can check the current status of the books
<br>
http://localhost:8072/member/book
<br>
http://localhost:8072/member/books/110
<br>
* BookAssignedAPI :
<br>
In this api, we Can view the books assigned to him.
<br>
http://localhost:8072/member/books/6
<br>
* RaiseRequestAPI:
<br>
In this api,Can raise a new request for an available book
<br>
http://localhost:8072/member/books/10
<br>
* HistoryAPI:
<br>
In this api, Can view the history of books issued to him previously
<br>
http://localhost:8072/member/history
<br>
# SWAGGER-API
<br>
we are using the swagger-api for Librarian
<br>
http://localhost:8072/swagger-ui.html
<br>
# H2 Database
<br>
we are store the data in h2 database
<br>
http://localhost:8072/h2
<br>
we have 6 tables for member
<br>
![Screenshot (87)](https://user-images.githubusercontent.com/113039639/188909762-83f6b017-7e56-4f3c-a6da-a525132318f5.png)
<br>
# API GATEWAY
<br>
http://localhost:9192/member/
<br>
# EUREKA SERVER
<br>
 we are registering the librarian and member microservices into eureka server
<br>
http://localhost:8720
<br>
![Screenshot (88)](https://user-images.githubusercontent.com/113039639/188912076-7678593c-f491-4751-9f7a-62136af0996c.png)
<br>
![Screenshot (89)](https://user-images.githubusercontent.com/113039639/188912150-b223a85f-0fac-410f-bf32-d5407e5a3d92.png)
<br>
![Screenshot (90)](https://user-images.githubusercontent.com/113039639/188912230-afc408b1-f257-4bff-99ac-eecc0dd43f2e.png)


