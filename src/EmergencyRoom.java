import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyRoom {
    private final PriorityQueue<Patient> patients;

    public EmergencyRoom(Comparator<Patient> comparator) {
        this.patients = new PriorityQueue<>(comparator);
    }

    public void checkIn(Patient patient, Severity severity) {
patient.setSeverity(severity);
patient.setArrivalTime(LocalDateTime.now());
patients.add(patient);
}

public Patient admit() {
return patients.poll();
}

public boolean isEmpty() {
return patients.isEmpty();
}}