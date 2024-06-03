package com.mikkita.spring.springboot.spring_course_spring_data_rest.dao;






import com.mikkita.spring.springboot.spring_course_spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //employees
}
