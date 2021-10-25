import java.util.ArrayList;
import java.util.UUID;

public class StudentList {
  private static StudentList students = null;

  private static ArrayList<Student> studentList = new ArrayList<>();

  private StudentList() {
    studentList = DataLoader.loadStudents();
  }
  public static StudentList getInstance() {
	if(students == null) {
		students = new StudentList();
	}
	
	return students;
}

public ArrayList<Student> getStudentList() {
	return studentList;
}

public void addStudent(String firstName, String lastName, String userName, String password, String email, String phoneNumber, String major) {
	studentList.add(new Student(firstName, lastName, userName, password, email, phoneNumber, major));
}

public void logout(){
	DataWriter.saveStudents();
}
}
	

