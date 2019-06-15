package services;

import domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long Id);
    List<Customer>findAllCustomers();
}
