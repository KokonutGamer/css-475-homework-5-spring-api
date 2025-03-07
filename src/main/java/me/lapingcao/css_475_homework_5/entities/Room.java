package me.lapingcao.css_475_homework_5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Room {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    private @NonNull String building;
    private @NonNull String roomnumber;
    private Integer capacity;
}