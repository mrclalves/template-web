package br.mrcl.laboratorio.web.service;

import br.mrcl.laboratorio.web.model.Employee;

public interface EmployeeService {

    public Employee findEmployeeById(long empId);

    public boolean addEmployee(Employee employee);
    
}
