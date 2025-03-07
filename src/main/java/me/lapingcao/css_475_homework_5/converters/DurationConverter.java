package me.lapingcao.css_475_homework_5.converters;

import java.sql.SQLException;
import java.time.Duration;

import org.postgresql.util.PGInterval;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, String> {

    @Override
    public String convertToDatabaseColumn(Duration attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public Duration convertToEntityAttribute(String dbData) {
        if(dbData == null) {
            return null;
        }
        try {
            PGInterval pgInterval = new PGInterval(dbData);
            return Duration.ofSeconds((long) pgInterval.getSeconds())
                    .plusMinutes(pgInterval.getMinutes())
                    .plusHours(pgInterval.getHours())
                    .plusDays(pgInterval.getDays())
                    .plusSeconds((long) (pgInterval.getSeconds()));
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

}