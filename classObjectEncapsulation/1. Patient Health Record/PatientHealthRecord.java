package classObjectEncapsulation;

public class PatientHealthRecord {
	private String name; 
	private int age;
	private double weight;
	private double height;
	
	public PatientHealthRecord(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		
		return this.weight/(this.height*this.height);
	}
	
	public String getHealthStatus() {
		if(calculateBMI() < 18.5)
			return "Underweight";
		else if(18.5 <= calculateBMI()  && calculateBMI() < 24.9)
			return "Normal weight";
		else
			return "Overweight";
	}
}
