# Postman Requests:

GET: Listing all records in Postman with the following GET request: `http://dummy.restapiexample.com/api/v1/employees`;

GET: Listing specific record in Postman with the following GET request: `http://dummy.restapiexample.com/api/v1/employees/1 (:id)`;

POST: Creating new records with Postman with the following POST request: `http://dummy.restapiexample.com/api/v1/employees/create`;
& adding the following object to the POST request: `{ "name": "Peter", "salary": "5000", "age": "23" }`;

PUT: Updating a specific record with Postman with the following PUT request: `http://dummy.restapiexample.com/api/v1/update/9999 (:id)`;
& adding the following object to the PUT request: `{ "name": "Todor" }`;

DELETE: Deleting a specific record with Postman with the following DELETE request: `http://dummy.restapiexample.com/api/v1/delete/9999 (:id)`;
