package br.mrcl.laboratorio.web.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.mrcl.laboratorio.TemplateWebTesteSpring;
import br.mrcl.laboratorio.web.model.Employee;
import br.mrcl.laboratorio.web.persistence.EmployeeRepository;

public class TesteEmployeeServiceImpl extends TemplateWebTesteSpring  {
    
    @Autowired()
    private EmployeeRepository employeeRepository;
    

    @Test
    public void testFindEmployeeById() {
        fail("Not yet implemented");
    }

    @Test
    public void testAddEmployee() {
        Employee emp1;
        Employee emp2;
        emp1 = new Employee();
        emp1.setFirstName("Huong");
        emp1.setLastName("Nguyen");
        emp2 = new Employee();
        emp2.setFirstName("Khang");
        emp2.setLastName("Le");
        employeeRepository.addEmployee(emp1);
        employeeRepository.addEmployee(emp2);
        
        Employee empT1 = employeeRepository.findEmployeeById(1);
        Employee empT2 = employeeRepository.findEmployeeById(2);
        
        System.out.println(empT1.toString());
        System.out.println(empT2.toString());
        
    }

}
