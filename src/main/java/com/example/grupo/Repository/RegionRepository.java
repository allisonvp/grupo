package com.example.grupo.Repository;

import com.example.grupo.Entity.Country;
import com.example.grupo.Entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface RegionRepository extends JpaRepository<Region, BigDecimal> {

}
