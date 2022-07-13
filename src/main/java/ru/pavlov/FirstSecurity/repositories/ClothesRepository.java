package ru.pavlov.FirstSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlov.FirstSecurity.models.Cloth;

@Repository
public interface ClothesRepository extends JpaRepository<Cloth, Integer> {
}
