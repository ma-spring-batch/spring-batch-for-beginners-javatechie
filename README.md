# spring-batch-for-beginners-javatechie
This tutorial will give you complete picture about spring batch and its workflow with realtime example

[Github repo][(https://github.com/Java-Techie-jt/spring-batch-example)

[IQ | Spring Batch for Beginners | Process Million of Record Faster Using Spring Batch | JavaTechie](https://www.youtube.com/watch?v=hr2XTbKSdAQ)

Connect to DB (choose one of below options): 
- mysql -h localhost -u root -p
- /usr/local/mysql/bin/mysql -u root -p 

Create DB by Command Line: **CREATE DATABASE javatechie;**;

Queries: 
- SELECT customer_id, contact, country, dob, email, first_name, gender, last_name
  FROM javatechie.customers_info;
- DELETE FROM javatechie.customers_info;
- SELECT * FROM javatechie.BATCH_STEP_EXECUTION;

Postman: curl --location --request POST 'http://localhost:9191/jobs/importCustomers'