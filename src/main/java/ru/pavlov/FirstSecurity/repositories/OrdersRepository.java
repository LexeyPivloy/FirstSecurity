package ru.pavlov.FirstSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlov.FirstSecurity.models.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
