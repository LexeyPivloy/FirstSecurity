package ru.pavlov.FirstSecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.pavlov.FirstSecurity.models.Customer;
import ru.pavlov.FirstSecurity.repositories.CustomersRepository;

import java.util.List;

@Service
public class CustomersService {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

/*
    public ResponseEntity<Object> getAllUsers(){
        List<Customer> customers = customersRepository.findAll();
        if(customers.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
*/

}
