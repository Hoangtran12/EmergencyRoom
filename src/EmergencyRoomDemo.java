import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.util.Comparator;
public class EmergencyRoomDemo {
    public static void main(String[] args) {
EmergencyRoom emergencyRoom = new EmergencyRoom(new patientComparator().patientComparator);
Patient jeff = new Patient("Jeff Barnes", LocalDateTime.of(1968, 12, 19, 12, 03));
emergencyRoom.checkIn(jeff, Severity.EIGHT);

Patient tara = new Patient("Tara Silva", LocalDateTime.of(1975, 5, 8, 10, 10));
emergencyRoom.checkIn(tara, Severity.EIGHT);

Patient ruth = new Patient("Ruth Mendez", LocalDateTime.of(1965, 1, 22, 8, 20));
emergencyRoom.checkIn(ruth, Severity.SEVEN);

Patient melvin = new Patient("Melvin Ingram", LocalDateTime.of(1965, 1, 22, 9, 17));
emergencyRoom.checkIn(melvin, Severity.SEVEN);

Patient mirabella = new Patient("Mirabella Jones", LocalDateTime.of(1973, 7, 11, 7, 0));
emergencyRoom.checkIn(mirabella, Severity.SEVEN);

while (!emergencyRoom.isEmpty()) {
    Patient admittedPatient = emergencyRoom.admit();
    System.out.println("Admitted: " + admittedPatient.getName() + "\n DOB:" + admittedPatient.getDob() + " AM\n Severity= " +
            admittedPatient.getSeverity() + "\n ArrivalTime: " + admittedPatient.getArrivalTime());
}
}
}