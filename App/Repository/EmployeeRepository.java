package com.SpringBootHibernateMySQLCRUDRESTAPI.App.Repository;

import com.SpringBootHibernateMySQLCRUDRESTAPI.App.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    Employee findByemail(String s);
}
