# Postman Requests:

GET: Listing all records in Postman with the following GET request: `http://dummy.restapiexample.com/api/v1/employees`; <br>

GET: Listing specific record in Postman with the following GET request: `http://dummy.restapiexample.com/api/v1/employees/1 (:id)`; <br>

POST: Creating new records with Postman with the following POST request: `http://dummy.restapiexample.com/api/v1/employees/create`; <br>
& adding the following object to the POST request: `{ "name": "Peter", "salary": "5000", "age": "23" }`; <br>

PUT: Updating a specific record with Postman with the following PUT request: `http://dummy.restapiexample.com/api/v1/update/9999 (:id)`; <br>
& adding the following object to the PUT request: `{ "name": "Todor" }`; <br>

DELETE: Deleting a specific record with Postman with the following DELETE request: `http://dummy.restapiexample.com/api/v1/delete/9999 (:id)`; <br>
