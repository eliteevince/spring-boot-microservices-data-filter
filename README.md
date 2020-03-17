# spring-boot-microservices-data-filter

## Description about project
In this project there are two module we have used, One is called **'data-filter-operation'** and one is **'data-filter-service'**.
in which data-filter-service is as a front controller and data-filter-operation is use for backend operation.

Data-filter-service is communicating with data-filter-operation internally using RestTemplete of spring-boot.

### How to run
- Download both module from git repository and unzip wherever you want. 
- then import both project in any IDE. 
- you need to build both project, and run one by one.
- we prefer to run **data-filter-operation** first and then **data-filter-service**.
- after run both project Data-filter view page is visible on **'localhost:8080/data-filter-service/'**. 
- Here when blank textbox load all data from back-end, when you enter text to filter the request hit to **'data-filter-service'** and from there **'data-filter-operation'** is called.
- **'data-filter-operation'** send back to **'data-filter-service'** and from there we can get the result of your entered text.
