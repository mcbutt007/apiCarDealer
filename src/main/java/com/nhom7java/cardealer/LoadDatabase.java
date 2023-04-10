package com.nhom7java.cardealer;


import java.util.Date;
import java.util.List;

import com.nhom7java.cardealer.models.*;
import com.nhom7java.cardealer.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadDatabase implements CommandLineRunner {

    private final CarRepository carRepository;
    private final CustomerRepository customerRepository;
    private final DealerRepository dealerRepository;
    private final OrderRepository orderRepository;

    public LoadDatabase(CarRepository carRepository, CustomerRepository customerRepository, DealerRepository dealerRepository, OrderRepository orderRepository) {
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
        this.dealerRepository = dealerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Load mockup data for cars
        Car car1 = new Car("Toyota", "Camry", 2021, 25000.00, 0, "Silver", "https://example.com/camry.jpg");
        Car car2 = new Car("Honda", "Accord", 2021, 28000.00, 5000, "White", "https://example.com/accord.jpg");
        Car car3 = new Car("Ford", "Mustang", 2022, 40000.00, 10000, "Blue", "https://example.com/mustang.jpg");
        Car car4 = new Car("Chevrolet", "Camaro", 2022, 45000.00, 2000, "Red", "https://example.com/camaro.jpg");
        Car car5 = new Car("Nissan", "Altima", 2020, 22000.00, 8000, "Black", "https://example.com/altima.jpg");

        carRepository.saveAll(List.of(car1, car2, car3, car4, car5));

        // Load mockup data for customers
        Customer customer1 = new Customer("John", "Doe", "john.doe@example.com", "+1-123-456-7890");
        Customer customer2 = new Customer("Jane", "Smith", "jane.smith@example.com", "+1-987-654-3210");
        Customer customer3 = new Customer("David", "Johnson", "david.johnson@example.com", "+1-456-789-1230");
        Customer customer4 = new Customer("Sarah", "Williams", "sarah.williams@example.com", "+1-789-123-4560");
        Customer customer5 = new Customer("Michael", "Brown", "michael.brown@example.com", "+1-321-654-9870");

        customerRepository.saveAll(List.of(customer1, customer2, customer3, customer4, customer5));

        // Load mockup data for dealers
        // Create a list of Dealer objects
        Dealer dealer1 = new Dealer("ABC Motors", "1234 Elm St", "+1-888-123-4567");
        Dealer dealer2 = new Dealer("DEF Autos", "5678 Oak St", "+1-888-987-6543");
        Dealer dealer3 = new Dealer("GHI Cars", "9876 Maple St", "+1-888-789-3210");
        Dealer dealer4 = new Dealer("LMN Auto", "5432 Pine St, Dallas", "+1-888-789-1234");
        Dealer dealer5 = new Dealer("JKL Motors", "6789 Birch St, San Francisco", "+1-888-321-6547");

        dealerRepository.saveAll(List.of(dealer1, dealer2, dealer3, dealer4, dealer5));

        // Load mockup data for orders
        Order order1 = new Order(customer1, car1, new Date());
        Order order2 = new Order(customer2, car2,  new Date());
        Order order3 = new Order(customer3, car3,  new Date());
        Order order4 = new Order(customer4, car4,  new Date());
        Order order5 = new Order(customer5, car5,  new Date());

        orderRepository.saveAll(List.of(order1, order2, order3, order4, order5));

        System.out.println("Mockup data loaded successfully!");
    }
}