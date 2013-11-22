public class Student {

	private String fName;
	private String lName;
	private int grade;

	public Student(String lName, String fName, int grade) {
		this.lName = lName;
		this.fName = fName;
		this.grade = grade;
	}

	public String toString() {
		String retStr = this.fName + " " + this.lName + " got a grade of "
		+ this.grade;
		return retStr;
	}
}
