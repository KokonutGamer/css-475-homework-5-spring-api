package me.lapingcao.css_475_homework_5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "phonetype")
public class PhoneType {
    private @Id String id;
    private @NonNull String name;
}