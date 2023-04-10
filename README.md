Project tree

- src\
    - main\
      - java\
        - com\
          - cardealer\
            - controllers\
              - CarController.java\
              - CustomerController.java\
              - DealerController.java\
              - OrderController.java\
            - services\
              - CarService.java\
              - CustomerService.java\
              - DealerService.java\
              - OrderService.java\
            - repositories\
              - CarRepository.java\
              - CustomerRepository.java\
              - DealerRepository.java\
              - OrderRepository.java\
            - utils\
              - ApiError.java\
              - ApiResponse.java\
              - Constants.java\
            - exceptions\
              - ApiException.java\
              - ErrorDetails.java\
              - GlobalExceptionHandler.java\
            - config\
              - SwaggerConfig.java\
            - models\
              - Car.java\
              - Customer.java\
              - Dealer.java\
              - Order.java\
            - CarDealerApplication.java\
      - resources\
        - application.properties\
        - static\
        - templates\
        - db\
          - migration\
            - V1**Create_Car_Table.sql\
            - V2**Create_Customer_Table.sql\
            - V3**Create_Dealer_Table.sql\
            - V4**Create_Order_Table.sql\
        - static\
        - templates\
    - test\
      - java\
        - com\
          - cardealer\
            - controllers\
              - CarControllerTest.java\
              - CustomerControllerTest.java\
              - DealerControllerTest.java\
              - OrderControllerTest.java\
            - services\
              - CarServiceTest.java\
              - CustomerServiceTest.java\
              - DealerServiceTest.java\
              - OrderServiceTest.java\
            - repositories\
              - CarRepositoryTest.java\
              - CustomerRepositoryTest.java\
              - DealerRepositoryTest.java\
              - OrderRepositoryTest.java\
            - CarDealerApplicationTests.java\
      - resources\
        - application.properties

- `controllers`: This directory contains the controllers that handle incoming HTTP requests and define the REST endpoints for the Car, Customer, Dealer, and Order resources. These controllers are responsible for receiving requests, processing them, and returning appropriate responses.

- `services`: This directory contains the service classes that implement the business logic for the Car, Customer, Dealer, and Order resources. These services are responsible for processing the business logic, interacting with the repositories, and performing operations such as creating, updating, retrieving, and deleting records in the database.

- `repositories`: This directory contains the repository interfaces that define the methods for interacting with the database to perform CRUD (Create, Read, Update, Delete) operations on the Car, Customer, Dealer, and Order entities. These repository interfaces are used by the service classes to communicate with the database and perform database operations.

- `utils`: This directory contains utility classes such as `ApiError`, `ApiResponse`, and `Constants` that provide common functionalities that are used across the project, such as handling API errors, defining standard API response formats, and storing constants.

- `exceptions`: This directory contains exception classes that handle specific types of exceptions that may occur during the execution of the application, such as `ApiException` and `ErrorDetails`. These exception classes provide custom error handling and can be used to handle specific exceptions that occur in the application.

- `config`: This directory contains configuration classes, such as `SwaggerConfig`, which is used to configure Swagger, an API documentation tool, to generate documentation for the REST APIs in the project.

- `models`: This directory contains the model classes that represent the entities in the system, such as `Car`, `Customer`, `Dealer`, and `Order`. These model classes define the structure of the data and provide getter and setter methods for accessing and modifying the data.

- `CarDealerApplication`: This is the main class of the Spring Boot application, which serves as the entry point for the application. It contains the `main` method that starts the Spring Boot application and sets up the Spring context.

-   `controllers`: This directory contains the controllers that handle incoming HTTP requests and define the REST endpoints for the Car, Customer, Dealer, and Order resources. These controllers are responsible for receiving requests, processing them, and returning appropriate responses.

-   `services`: This directory contains the service classes that implement the business logic for the Car, Customer, Dealer, and Order resources. These services are responsible for processing the business logic, interacting with the repositories, and performing operations such as creating, updating, retrieving, and deleting records in the database.

-   `repositories`: This directory contains the repository interfaces that define the methods for interacting with the database to perform CRUD (Create, Read, Update, Delete) operations on the Car, Customer, Dealer, and Order entities. These repository interfaces are used by the service classes to communicate with the database and perform database operations.

-   `utils`: This directory contains utility classes such as `ApiError`, `ApiResponse`, and `Constants` that provide common functionalities that are used across the project, such as handling API errors, defining standard API response formats, and storing constants.

-   `exceptions`: This directory contains exception classes that handle specific types of exceptions that may occur during the execution of the application, such as `ApiException` and `ErrorDetails`. These exception classes provide custom error handling and can be used to handle specific exceptions that occur in the application.

-   `config`: This directory contains configuration classes, such as `SwaggerConfig`, which is used to configure Swagger, an API documentation tool, to generate documentation for the REST APIs in the project.

-   `models`: This directory contains the model classes that represent the entities in the system, such as `Car`, `Customer`, `Dealer`, and `Order`. These model classes define the structure of the data and provide getter and setter methods for accessing and modifying the data.

-   `CarDealerApplication`: This is the main class of the Spring Boot application, which serves as the entry point for the application. It contains the `main` method that starts the Spring Boot application and sets up the Spring context.Available REST APIs
===================

Customers API

-   Endpoint: `/customers`

-   Method: `GET`

-   Description: Get a list of all customers.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: List of customers in JSON format.
-   Endpoint: `/customers/{id}`

-   Method: `GET`

-   Description: Get a customer by ID.

-   Path Parameters:

    -   `id`: ID of the customer.
-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Customer information in JSON format.
-   Endpoint: `/customers`

-   Method: `POST`

-   Description: Create a new customer.

-   Request Body: Customer information in JSON format.

-   Response:

    -   Status Code: `201 (Created)`
    -   Body: Customer information of the created customer in JSON format.
-   Endpoint: `/customers/{id}`

-   Method: `PUT`

-   Description: Update a customer by ID.

-   Path Parameters:

    -   `id`: ID of the customer.
-   Request Body: Updated customer information in JSON format.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Updated customer information in JSON format.
-   Endpoint: `/customers/{id}`

-   Method: `DELETE`

-   Description: Delete a customer by ID.

-   Path Parameters:

    -   `id`: ID of the customer.
-   Response:

    -   Status Code: `204 (No Content)`

Cars API

-   Endpoint: `/cars`

-   Method: `GET`

-   Description: Get a list of all cars.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: List of cars in JSON format.
-   Endpoint: `/cars/{id}`

-   Method: `GET`

-   Description: Get a car by ID.

-   Path Parameters:

    -   `id`: ID of the car.
-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Car information in JSON format.
-   Endpoint: `/cars`

-   Method: `POST`

-   Description: Create a new car.

-   Request Body: Car information in JSON format.

-   Response:

    -   Status Code: `201 (Created)`
    -   Body: Car information of the created car in JSON format.
-   Endpoint: `/cars/{id}`

-   Method: `PUT`

-   Description: Update a car by ID.

-   Path Parameters:

    -   `id`: ID of the car.
-   Request Body: Updated car information in JSON format.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Updated car information in JSON format.
-   Endpoint: `/cars/{id}`

-   Method: `DELETE`

-   Description: Delete a car by ID.

-   Path Parameters:

    -   `id`: ID of the car.
-   Response:

    -   Status Code: `204 (No Content)`

Dealer Information API

-   Endpoint: `/dealers`

-   Method: `GET`

-   Description: Get a list of all dealers.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: List of dealers in JSON format.
-   Endpoint: `/dealers/{id}`

-   Method: `GET`

-   Description: Get a dealer by ID.

-   Path Parameters:

    -   `id`: ID of the dealer.
-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Dealer information in JSON format.
-   Endpoint: `/dealers`

-   Method: `POST`

-   Description: Create a new dealer.

-   Request Body: Dealer information in JSON format.

-   Response:

    -   Status Code: `201 (Created)`
    -   Body: Dealer information of the created dealer in JSON format.
-   Endpoint: `/dealers/{id}`

-   Method: `PUT`

-   Description: Update a dealer by ID.

-   Path Parameters:

    -   `id`: ID of the dealer.
-   Request Body: Updated dealer information in JSON format.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Updated dealer information in JSON format.
-   Endpoint: `/dealers/{id}`

-   Method: `DELETE`

-   Description: Delete a dealer by ID.

-   Path Parameters:

    -   `id`: ID of the dealer.
-   Response:

    -   Status Code: `204 (No Content)`

Orders API

-   Endpoint: `/orders`

-   Method: `GET`

-   Description: Get a list of all orders.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: List of orders in JSON format.
-   Endpoint: `/orders/{id}`

-   Method: `GET`

-   Description: Get an order by ID.

-   Path Parameters:

    -   `id`: ID of the order.
-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Order information in JSON format.
-   Endpoint: `/orders`

-   Method: `POST`

-   Description: Create a new order.

-   Request Body: Order information in JSON format.

-   Response:

    -   Status Code: `201 (Created)`
    -   Body: Order information of the created order in JSON format.
-   Endpoint: `/orders/{id}`

-   Method: `PUT`

-   Description: Update an order by ID.

-   Path Parameters:

    -   `id`: ID of the order.
-   Request Body: Updated order information in JSON format.

-   Response:

    -   Status Code: `200 (OK)`
    -   Body: Updated order information in JSON format.
-   Endpoint: `/orders/{id}`

-   Method: `DELETE`

-   Description: Delete an order by ID.

-   Path Parameters:

    -   `id`: ID of the order.
-   Response:

    -   Status Code: `204 (No Content)`


Mockup DATABASE: `LoadDatabase.java` is a class that is responsible for loading mockup data into a Java application. It typically contains methods or functions that create and populate mock data for testing or development purposes. The `LoadDatabase` class is used to initialize the application's database with sample data, so that the application can be tested with realistic data during development or demonstration.

