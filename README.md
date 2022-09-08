# LIBRARY-MANAGEMENT-SYSTEM
<br>                                             
This assignment is developed by using Microservices. Library management system provides online real time information about the books available in Library. It is capable of managing book issues and returns. Librarian will act as the administrator to control members and manage books.  The member’s status of issue/return is maintained in the library database.Members will be able to check the availability of books in different categories. Member’s details and book details can be fetched by the librarian when required.
<br>                                                                         
In this assignment, we have two microservices such as Librarian, Member.
<br>
 # 1. Librarian
<br>
# Rest API
<br>
we are using RestApi to add,view,update the data for librarian
<br>
*RegisterAPI :
<br>
In this api, we Can register a member
<br>
*BookStatusAPI
<br>
In this api, we Can check the current status of books and Add/edit books and their information to the database
<br>
*CategoryBookAPI:
<br>
we Can view the different categories of books available in the library and we Can view the list of books available in each category
<br>
*BookIssueAPI:
<br>
In this api, we Can issue a book to the member
<br>
*ReportsAPI
<br>
In this api, we can see the reports of issued and returned books
<br>
# H2 DATABASE
<br>
we are store the data in h2 database
<br>
we have 6 tables for library

![Screenshot (85)](https://user-images.githubusercontent.com/113039639/188908425-9dbb1e47-96a0-4344-8702-662d3b2b1c78.png)
<br>
# 2. Member
<br>
# Rest API
<br>
we are using RestApi to add,view,update the data for Member
<br>
*CategoryBookAPI:
<br>
In this api, we Can view the different categories of books available in the library and we Can view the list of books available in each category
<br>
* BookStatusAPI :
<br>
* BookAssignedAPI :
<br>
In this api, we Can view the books assigned to him.
<br>
* RaiseRequestAPI:
<br>
In this api,Can raise a new request for an available book
<br>
* HistoryAPI:
<br>
In this api, Can view the history of books issued to him previously
<br>
# H2 Database
<br>
we are store the data in h2 database
<br>
we have 6 tables for member
<br>

![Screenshot (87)](https://user-images.githubusercontent.com/113039639/188909762-83f6b017-7e56-4f3c-a6da-a525132318f5.png)
<br>
# EUREKA SERVER
<br>
we are registering the librarian and member microservices into eureka server

![Screenshot (88)](https://user-images.githubusercontent.com/113039639/188912076-7678593c-f491-4751-9f7a-62136af0996c.png)

![Screenshot (89)](https://user-images.githubusercontent.com/113039639/188912150-b223a85f-0fac-410f-bf32-d5407e5a3d92.png)

![Screenshot (90)](https://user-images.githubusercontent.com/113039639/188912230-afc408b1-f257-4bff-99ac-eecc0dd43f2e.png)

# SWAGGER-API and API GATEWAY
we have swagger api and api gateway for librarian and member microservices
