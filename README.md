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
