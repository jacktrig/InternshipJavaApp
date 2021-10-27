/**
 * @author Jordan Hennings
 */

import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private ArrayList<Education> educations;
    public ArrayList<Resume> resumes;
    public ArrayList<ResumeExperience> experiences;
    private ArrayList<Review> reviews;
    
    public Student() {
      
    }

    public Student(String id,
                   String firstName,
                   String lastName,
                   String username,
                   String password,
                   String email,
                   String phone
                  ) {
      super(id, firstName, lastName, username, password, email, phone);         
      this.resumes = new ArrayList<>();
      this.reviews = new ArrayList<>();
    }
    public ArrayList<Education> getEducations() {
      return this.educations;
    }

    public void addEducation(Education education) {
      this.educations.add(education);
    }

    public void addResume(Resume resume) {
      this.resumes.add(resume);
    }
    public ArrayList<Resume> getResumes() {
      return this.resumes;
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