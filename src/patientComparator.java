import java.util.Comparator;
public class patientComparator{
    Comparator<Patient> patientComparator = new Comparator<>() {

    @Override
     public int compare(Patient p1, Patient p2) {
        if (p1.getSeverity().compareTo(p2.getSeverity()) != 0) {
            return p2.getSeverity().compareTo(p1.getSeverity()); // Patients with greater severity get priority
        } else if (!p1.getDob().equals(p2.getDob())) {
            return p2.getDob().compareTo(p1.getDob()); // Older patients with the same severity get priority
        } else {
            return p1.getArrivalTime().compareTo(p2.getArrivalTime()); // Patients with same age and severity who arrive earlier get priority
        }
    }
};}
