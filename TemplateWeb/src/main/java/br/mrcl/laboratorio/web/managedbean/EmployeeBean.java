package br.mrcl.laboratorio.web.managedbean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mrcl.laboratorio.web.model.Employee;
import br.mrcl.laboratorio.web.service.EmployeeService;
//import javax.faces.bean.ManagedBean;

//@ManagedBean(name ="empBean")
@Component("empBean")
public class EmployeeBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Employee employee;
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;
    
    
    @Autowired()
    private EmployeeService employeeService;
    
    public EmployeeBean() {
        emp1 = new Employee();
        emp1.setFirstName("Huong");
        emp1.setLastName("Nguyen");
        emp2 = new Employee();
        emp2.setFirstName("Khang");
        emp2.setLastName("Le");
        emp3 = new Employee();
        emp3.setFirstName("TESTE QUE ");
        emp3.setLastName("FUNCIONA....");

    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public void addEmployee(){
        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        employeeService.addEmployee(emp3);
        employee= employeeService.findEmployeeById(emp3.getEmpId());
    }

}
