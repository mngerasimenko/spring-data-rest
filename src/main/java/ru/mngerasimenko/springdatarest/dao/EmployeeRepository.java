package ru.mngerasimenko.springdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mngerasimenko.springdatarest.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
