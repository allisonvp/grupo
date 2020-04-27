package com.example.grupo.Repository;

import com.example.grupo.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {

    List<EmployeeEntity> findByEmail(String email);

}
