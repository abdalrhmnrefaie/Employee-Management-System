package com.abdalrhmnrefaie.curddatabase.services;

import java.util.List;

import com.abdalrhmnrefaie.curddatabase.models.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
