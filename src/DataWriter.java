import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	public static void saveAdmins() {
		AdminList adminList = AdminList.getInstance();
		ArrayList<Admin> admins = adminList.getAdminList();
		JSONArray adminsJSON = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< admins.size(); i++) {
			adminsJSON.add(getAdminJSON(admins.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(ADMIN_FILE_NAME)) {
 
            file.write(adminsJSON.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getAdminJSON (Admin admin) {
		JSONObject adminDetails = new JSONObject();
		adminDetails.put(USER_ID, admin.getID());
		adminDetails.put(USER_FIRST_NAME, admin.getFirstName());
		adminDetails.put(USER_LAST_NAME, admin.getLastName());
		adminDetails.put(USER_USER_NAME, admin.getUserName());
		adminDetails.put(USER_PASSWORD, admin.getPassword());	
		adminDetails.put(USER_EMAIL, admin.getEmail());	
		adminDetails.put(USER_PHONE_NUMBER, admin.getPhoneNumber());
        
        return adminDetails;
	}	

	public static void saveStudents() {
		StudentList studentList = StudentList.getInstance();
		ArrayList<Student> students = studentList.getStudentList();
		JSONArray studentsJSON = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< students.size(); i++) {
			studentsJSON.add(getStudentJSON(students.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(STUDENT_FILE_NAME)) {
 
            file.write(studentsJSON.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getStudentJSON (Student student) {
		JSONObject studentDetails = new JSONObject();
		studentDetails.put(USER_FIRST_NAME, student.getFirstName());
		studentDetails.put(USER_LAST_NAME, student.getLastName());
		studentDetails.put(USER_PHONE_NUMBER, student.getPhoneNumber());
        
        return studentDetails;
	}
}