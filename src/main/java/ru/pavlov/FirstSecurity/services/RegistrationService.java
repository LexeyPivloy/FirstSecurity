package ru.pavlov.FirstSecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pavlov.FirstSecurity.models.Customer;
import ru.pavlov.FirstSecurity.repositories.CustomersRepository;

@Service
public class RegistrationService {

    private final CustomersRepository customersRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationService(CustomersRepository customersRepository, PasswordEncoder passwordEncoder) {
        this.customersRepository = customersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void register(Customer customer){
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        customer.setRole("ROLE_USER");
        customersRepository.save(customer);
    }
}
