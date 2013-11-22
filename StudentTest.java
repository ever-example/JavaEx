public class StudentTest {

	public static void main(String[] args) {
		String expectedString = "Mary Sue got a grade of 92\n"
		+ "Mary Moo got a grade of 21\n"
		+ "Gary Stu got a grade of 93\n"
		+ "John Doe got a grade of 89\n";

		String testString = "";

		Student[] students = new Student[4];
		
		Student sueMary = new Student("Sue", "Mary", 92);
		Student mooMary = new Student("Moo", "Mary", 21);
		Student stuGary = new Student("Stu", "Gary", 93);
		Student doeJohn = new Student("Doe", "John", 89);

		students[0] = sueMary;
		students[1] = mooMary;
		students[2] = stuGary;
		students[3] = doeJohn;

		//for (int i = 0; i < students.length; i++ {
		//	System.out.println(students[i]);
		//}

		for (int i = 0; i < students.length; i++) {
			testString = testString + students[i] + "\n";
		}

		if (testString.equals(expectedString)) {
			System.out.println("Test Passed");
		}

	}
}
