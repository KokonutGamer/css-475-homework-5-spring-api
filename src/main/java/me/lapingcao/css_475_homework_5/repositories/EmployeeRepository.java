package me.lapingcao.css_475_homework_5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import me.lapingcao.css_475_homework_5.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}