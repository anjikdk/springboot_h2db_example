# springboot_h2db_example

1. This project is used h2 database (in memory db)
2. To login into h2db, we need to run the spring boot application and then hit the URL on browser
    URL: http://localhost:2022/h2-console
    
Queries:

insert into emp (emp_id, address, fname, joining_date, lname, salary) 
values (1, 'blr', 'rak', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'rajesh', 20000.0);

insert into emp (emp_id, address, fname, joining_date, lname, salary) 
values (2, 'blr', 'alex', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'ameer', 20000.0);


