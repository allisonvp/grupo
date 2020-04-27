package com.example.grupo.Repository;

import com.example.grupo.Entity.JobHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistoryEntity,String> {
}
