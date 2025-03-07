package me.lapingcao.css_475_homework_5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Department {
    private @Id Integer id;
    private @NonNull String name;
}