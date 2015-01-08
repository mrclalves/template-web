package br.mrcl.laboratorio.web.persistence;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.mrcl.laboratorio.web.model.Employee;

@Repository(value = "employeeRepository")
@Transactional
public class EmployeeRepositoryImpl implements EmployeeRepository, Serializable {

    @Autowired
    private SessionFactory sessionFactory;

    public EmployeeRepositoryImpl() {
    }

    public boolean addEmployee(Employee emp) {
        try {
            sessionFactory.getCurrentSession().save(emp);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Employee findEmployeeById(long empId) {
        Employee result = new Employee();
        try {
            result = (Employee) sessionFactory.getCurrentSession().get(Employee.class, empId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
