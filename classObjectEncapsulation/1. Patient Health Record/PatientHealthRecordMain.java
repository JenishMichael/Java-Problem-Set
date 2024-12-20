package classObjectEncapsulation;

public class PatientHealthRecordMain {

	public static void main(String[] args) {
		PatientHealthRecord patientHealthRecord = new PatientHealthRecord("Raj", 50, 90, 1.7);
		System.out.println(patientHealthRecord.getHealthStatus());
	}

}
