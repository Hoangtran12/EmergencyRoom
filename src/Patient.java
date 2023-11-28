import java.time.LocalDateTime;
import java.util.Comparator;

public class Patient {
    private final String name;
    private final LocalDateTime dob;
    private Severity severity;
    private LocalDateTime arrivalTime;

    public Patient(String name, LocalDateTime dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", severity=" + severity +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}

enum Severity {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN;
}