/**
 * @author Jordan Hennings
 */

import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private String major;
    private double GPA;
    private ArrayList<Resume> resumes;
    private ArrayList<Review> reviews;
    
    public Student() {
      
    }

    public Student(
                   String firstName,
                   String lastName,
                   String username,
                   String password,
                   String email,
                   String phone,
                   String major) {
      this.major = major;
      resumes = new ArrayList<Resume>();
    }

    public String getMajor() {
      return major;
    }

    public void addResume(Resume resume) {
      resumes.add(resume);
    }

    public Resume createResume(String id, ArrayList<ResumeExperience> workExp, ArrayList<String> skills, ArrayList<String> currentClasses) {
      Resume newResume = new Resume(id, workExp, skills, currentClasses);
      resumes.add(newResume);
      return newResume;
    }

    public Review addReview(User writer, String comment, double score) {
      Review newReview = new Review(writer, comment, score);
      reviews.add(newReview);
      return newReview;  
    }
}