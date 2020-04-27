package com.example.grupo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_history")
public class JobHistoryEntity {

    @Id
    private String employee_id;
    @Column(nullable = false)
    private String start_date;
    private String end_date;
    private String job_id;
    private int department_id;
}
