package bootstrap;

import domain.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.CustomerRepository;

import java.awt.*;
import java.util.concurrent.Callable;


@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("himanshi");
        c1.setLastname("gupta");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c1.setFirstname("manoj");
        c1.setLastname("gupta");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c1.setFirstname("akansha");
        c1.setLastname("gupta");
        customerRepository.save(c2);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}

