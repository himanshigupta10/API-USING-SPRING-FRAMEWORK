package services;

import domain.Customer;
import org.springframework.stereotype.Service;
import repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
public Customer findCustomerById(Long id) {
            return customerRepository.getOne(id);

     }
@Override
        public List<Customer> findAllCustomers() {
            return customerRepository.findAll();
        }

}
