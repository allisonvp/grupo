package com.example.grupo.Repository;

import com.example.grupo.Entity.Country;
import com.example.grupo.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
}
