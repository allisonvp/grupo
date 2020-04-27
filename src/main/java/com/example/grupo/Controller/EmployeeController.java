package com.example.grupo.Controller;

import com.example.grupo.Entity.EmployeeEntity;
import com.example.grupo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/lista")
    public String listarEmployees(Model model) {
        List<EmployeeEntity> listaEmp = employeeRepository.findAll();
        model.addAttribute("lista", listaEmp);
        return "employee/listar";
    }

    @GetMapping("/crear")
    public String crearEmployee(){


        return "employee/crear";
    }

    @PostMapping("/guardar")
    public String guardarEmployee(EmployeeEntity employee){
        employeeRepository.save(employee);
        return "redirect:/employee/lista";
    }








}
