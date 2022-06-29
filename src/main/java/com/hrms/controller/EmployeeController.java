package com.hrms.controller;

import com.hrms.entities.Employee;
import com.hrms.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("controller")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping("fetch-all")
    public List<Employee>allEmployee(){
        return this.employeeService.findAll();
    }


    @PostMapping("save")
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }
    @PutMapping("update")
    public Employee update(@RequestBody Employee employee){
        return this.employeeService.update(employee);
    }
    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody Employee employee){
        return new ResponseEntity (HttpStatus.OK);
    }
}
