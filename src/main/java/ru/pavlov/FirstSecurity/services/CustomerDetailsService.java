package ru.pavlov.FirstSecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.pavlov.FirstSecurity.models.Customer;
import ru.pavlov.FirstSecurity.repositories.CustomersRepository;
import ru.pavlov.FirstSecurity.security.CustomerDetails;

import java.util.Optional;

@Service
public class CustomerDetailsService implements UserDetailsService {

    private final CustomersRepository customersRepository;

    @Autowired
    public CustomerDetailsService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Customer> customer = customersRepository.findByUsername(s);

        if(customer.isEmpty())
            throw new UsernameNotFoundException("User not found!");

        return new CustomerDetails(customer.get());
    }
}
