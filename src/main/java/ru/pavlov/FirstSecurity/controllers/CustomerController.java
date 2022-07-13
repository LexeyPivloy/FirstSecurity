package ru.pavlov.FirstSecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pavlov.FirstSecurity.services.CustomersService;

@RestController
public class CustomerController {
    private final CustomersService customersService;

    @Autowired
    public CustomerController(CustomersService customersService) {
        this.customersService = customersService;
    }

/*    @RequestMapping("/getAllUsers")
    public ResponseEntity<Object> getAllUsers(){
        return customersService.getAllUsers();
    }*/
}
