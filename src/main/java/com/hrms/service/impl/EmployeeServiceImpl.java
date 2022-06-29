package com.hrms.service.impl;

import com.hrms.entities.Employee;
import com.hrms.repository.EmployeeRepository;
import com.hrms.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
private final EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee entity) {
       Employee employee= this.employeeRepository.save(entity);
        return employee;
    }

    @Override
    public void delete(Employee entity) {
        this.employeeRepository.delete(entity);

    }

    @Override
    public Employee update(Employee entity) {
       return this.employeeRepository.save(entity);

    }

    @Override
    public Employee findOne(Long aLong) {
       return this.employeeRepository.findById(aLong).get();

    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();

    }
}
