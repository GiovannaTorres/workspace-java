package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		return 60 - finalGrade();
	}
	
	public String aproved() {
		if(finalGrade() > 60.0) {
			return "PASS";
		} else {
			return "FAILED " + String.format("\nMissing points: %.2f", missingPoints());
		}
	}
	
	public String toString() {
		return name + String.format("\nFinal Grade: %.2f", finalGrade()) + "\n" + aproved();
	}

}
