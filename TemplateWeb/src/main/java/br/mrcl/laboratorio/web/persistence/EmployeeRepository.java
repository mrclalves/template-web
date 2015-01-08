package br.mrcl.laboratorio.web.persistence;

import br.mrcl.laboratorio.web.model.Employee;

public interface EmployeeRepository {

    public boolean addEmployee(Employee emp);

    public Employee findEmployeeById(long empId);
}
