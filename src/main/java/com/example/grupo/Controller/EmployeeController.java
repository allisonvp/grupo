package com.example.grupo.Controller;

import com.example.grupo.Entity.Department;
import com.example.grupo.Entity.EmployeeEntity;
import com.example.grupo.Entity.JobsEntity;
import com.example.grupo.Repository.DepartmentRepository;
import com.example.grupo.Repository.EmployeeRepository;
import com.example.grupo.Repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/employee")
@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    JobsRepository jobsRepository;
    @Autowired
    DepartmentRepository departmentRepository;

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


    @GetMapping("/editar")
    public String editarEmpleado(@RequestParam("id") String id,
                            Model model){
        Optional<EmployeeEntity> opt = employeeRepository.findById(id);
        if (opt.isPresent()) {
            EmployeeEntity employee =opt.get();

            List<JobsEntity> listaJob = jobsRepository.findAll();
            List<Department> listaDep = departmentRepository.findAll();
            List<EmployeeEntity> listaMan = employeeRepository.findAll();
            model.addAttribute("listaJob", listaJob);
            model.addAttribute("listaDep", listaDep);
            model.addAttribute("listaMan", listaMan);
            model.addAttribute("employee", employee);
            return "employee/editar";
        } else {
            return "redirect:/employee/lista";
        }
    }

    @PostMapping("/buscar")
    public String buscarEmployee(@RequestParam("searchfield") String searchfield,
                                 Model model){

        List<EmployeeEntity> listaempleados = employeeRepository.findByEmail(searchfield);
        model.addAttribute("lista1",listaempleados);

        return "employee/listar";

    }






}
