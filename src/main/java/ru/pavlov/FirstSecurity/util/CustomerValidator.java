package ru.pavlov.FirstSecurity.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.pavlov.FirstSecurity.models.Customer;
import ru.pavlov.FirstSecurity.services.CustomerDetailsService;

@Component
public class CustomerValidator implements Validator {

    private final CustomerDetailsService customerDetailsService;

    @Autowired
    public CustomerValidator(CustomerDetailsService customerDetailsService) {
        this.customerDetailsService = customerDetailsService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer)target;

        try {
            customerDetailsService.loadUserByUsername(customer.getUsername());
        } catch (UsernameNotFoundException ignored){
            return;
        }

        errors.rejectValue("username","","User already exist");
    }
}
