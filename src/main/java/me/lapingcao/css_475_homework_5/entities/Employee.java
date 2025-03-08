package me.lapingcao.css_475_homework_5.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Employee {
    private @Id Integer id;
    private @NonNull String employeenum;
    private @NonNull String name;
    private @NonNull String email;

    // Foreign key handling
    @NonNull
    @ManyToOne
    @JoinColumn(name = "departmentid")
    private Department department;

    private @NonNull BigDecimal salary;
}