package me.lapingcao.css_475_homework_5.entities;

import java.sql.Timestamp;
import java.time.Duration;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import me.lapingcao.css_475_homework_5.converters.DurationConverter;

@Entity
@Data
public class Meeting {
    private @Id Integer id;
    private @NonNull Integer roomid;
    private @NonNull Timestamp starttime;
    
    @Column(columnDefinition = "INTERVAL")
    @Convert(converter = DurationConverter.class)
    private @NonNull Duration duration;
    private @NonNull String purpose;
    private @NonNull Integer creatorid;
    private Integer moderatorid;
}