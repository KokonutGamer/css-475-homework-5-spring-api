package me.lapingcao.css_475_homework_5.ids;

import java.io.Serializable;
import java.util.Objects;

import lombok.NonNull;

public class AttendeeId implements Serializable {
    private @NonNull Integer meetingid;
    private @NonNull Integer employeeid;

    public AttendeeId(@NonNull Integer meetingid, @NonNull Integer employeeid) {
        this.meetingid = meetingid;
        this.employeeid = employeeid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingid, employeeid);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof AttendeeId)) {
            return false;
        }
        AttendeeId other = (AttendeeId) obj;
        return this.meetingid == other.meetingid && this.employeeid == other.employeeid;
    }
}