package me.lapingcao.css_475_homework_5.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Employee {
    private @Id Integer id;
    private @NonNull String employeenum;
    private @NonNull String name;
    private @NonNull String email;
    private @NonNull Integer departmentid;
    private @NonNull BigDecimal salary;
}