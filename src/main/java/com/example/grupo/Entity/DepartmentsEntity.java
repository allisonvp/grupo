package com.example.grupo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DepartmentsEntity {

    @Id
    private int department_id;
    private String department_name;
    private String manager_id;
    private int location_id;
    private String department_short_name;

}
