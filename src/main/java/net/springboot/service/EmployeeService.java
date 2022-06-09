package net.springboot.service;

import net.springboot.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(long id);

    public void deleteEmployeeById(Long id);


}
