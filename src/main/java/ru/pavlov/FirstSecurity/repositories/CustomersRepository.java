package ru.pavlov.FirstSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlov.FirstSecurity.models.Customer;

import java.util.Optional;

@Repository
public interface CustomersRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByUsername(String username);
}
