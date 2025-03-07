package me.lapingcao.css_475_homework_5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import me.lapingcao.css_475_homework_5.ids.AttendeeId;

@Entity
@Data
@Table(name = "attendees")
@IdClass(AttendeeId.class)
public class Attendee {
    private @Id Integer meetingid;
    private @Id Integer employeeid;
}