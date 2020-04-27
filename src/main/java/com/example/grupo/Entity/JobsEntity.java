package com.example.grupo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class JobsEntity {

    @Id
    private String job_id;
    private String job_title;
    private int min_salary;
    private int max_salary;

}
